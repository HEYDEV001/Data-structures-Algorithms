package binarySearch.ShashCode.Questions;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,5,5,5,7,10,11,12,13,14};
        System.out.println(floorOfNumber(arr, 8));
        System.out.println(floorOfNumberAlternate(arr, 8));

    }
    public static int floorOfNumber(int[] arr, int target) {
        int ans=-1;
        int start =0 ;
        int end = arr.length-1;
        while(start<= end){
            int mid = start+ ((end-start)/2);
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                start = mid+1;
                ans = arr[mid];
            }else {
                end = mid-1;
            }
        }
        return ans;
    }


    // After all the iteration the end pointer will be at the index of the floor of the target
    // because its the only condition when we get out of the loop and didn't find the exact target
    public static int floorOfNumberAlternate(int[] arr, int target) {

        int start =0 ;
        int end = arr.length-1;
        while(start<= end){
            int mid = start+ ((end-start)/2);
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                start = mid+1;

            }else {
                end = mid-1;
            }
        }
        return arr[end];
    }
}
