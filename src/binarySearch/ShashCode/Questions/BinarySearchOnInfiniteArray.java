package binarySearch.ShashCode.Questions;

public class BinarySearchOnInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int target = 5;
        System.out.println(searchInfiniteArray(arr,0));
    }
    public static int searchInfiniteArray(int[] arr, int target) {
        int start =0 ;
        int end  = start+1;
        while(target > arr[end]){
            int newStart = end+1;
            end = end +(end -start +1) * 2;
            start = end;
        }
        while(start<= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
