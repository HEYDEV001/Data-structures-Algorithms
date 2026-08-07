package Searching;

public class TernarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2 ,3 ,4 ,5 ,6, 7, 8,9,10, 11, 12, 13, 14, 15, 16};
        System.out.println(ternarySearch(arr, 19));
    }
    public static int ternarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid1 = start+ (end-start)/2;
            int mid2 = end - (end-start)/2;
            if(arr[mid1]==target){
                return mid1;
            }else if(arr[mid2]==target){
                return mid2;
            } else if (target>arr[mid2]) {
                start = mid2+1;
            }else if(target<arr[mid1]){
                end = mid1-1;
            }else{
                start = mid1+1;
                end = mid2-1;
            }
        }
        return -1;
    }
}
