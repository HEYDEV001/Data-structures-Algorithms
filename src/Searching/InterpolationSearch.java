package Searching;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(interpolationSearch(arr, 1));
    }
    public static int interpolationSearch(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        while(start <= end && target >= arr[start] && target <= arr[end]){
            if(arr[start] == arr[end]){
                if(target == arr[start]){
                return start;
                }
            }
            int pos  = start + (target-arr[start])*(end -start)/(arr[end]-arr[start]);
              if(arr[pos] == target){
                  return pos;
              }else if(arr[pos] < target){
                  start = pos + 1;
              }else{
                  end = pos - 1;
              }
        }
        return -1;
    }
}
