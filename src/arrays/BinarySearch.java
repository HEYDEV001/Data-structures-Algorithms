package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = 8;
        System.out.println("The Index of target is " + binarySearch(arr, target));

    }
    public static int binarySearch(int[] arr, int target) {
        int start=0; // start index
        int end = arr.length-1; // last index
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                start= mid+1;
            }
            if(target>arr[mid]){

                end = mid-1;
            }
        }
        return -1;
    }
}
