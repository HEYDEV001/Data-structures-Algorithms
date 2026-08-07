package Searching;

public class ExponentialSearch {
    public static void main(String[] args) {
        int[] arr = {1,2 ,3 ,4 ,5 ,6, 7, 8,9,10, 11, 12, 13, 14, 15, 16};
        System.out.println(exponentialSearch(arr, 10));
    }
    public static int exponentialSearch(int[] arr, int target){

        int end  = 1;
        while(end < arr.length && target >= arr[end]){
            end = 2*end;
        }
        int start = end/2;
        end = Math.min(end, arr.length-1);
        while(start<=end){
            int mid = start + ((end-start)/2);
            if(target>arr[mid]){
                start = mid +1;
            }else if(target < arr[mid]){
                end  = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
