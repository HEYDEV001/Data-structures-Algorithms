package Searching;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr = {1,2 ,3 ,4 ,5 ,6, 7, 8,9,10, 11, 12, 13, 14, 15, 16};
        System.out.println(interpolationSearch(arr, 10));
    }
    public static int interpolationSearch(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        while(start <= end){
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
