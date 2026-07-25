package binarySearch.ShashCode.Questions;

public class CeilingOfANumber {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,5,5,5,5,7,10,11,12,13,14};
        System.out.println(findCeilingOfNumber(arr, 8));
        System.out.println(findCeilingOfNumberAlternate(arr, 8));

    }
    public static int findCeilingOfNumber(int[] arr, int target) {
        int start=0;
        int ans =-1;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                start = mid +1;
            }else{
                end = mid -1;
                ans = arr[mid];
            }
        }
        return ans;
    }

    public static int findCeilingOfNumberAlternate(int[] arr, int target) {
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return arr[start];
    }
}
