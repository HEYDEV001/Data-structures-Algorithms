package binarySearch.ShashCode.Questions;

public class FirstOccurrence {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,5,5,5,5,5,10,11,12,13,14};
        int target = 5;
        System.out.println(firstOccurrence(arr,target));
    }

    public static  int firstOccurrence(int[] arr, int target) {
        int ans =-1;
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                end = mid-1;
                continue;
            }
            if(arr[mid]<target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }


        }
        return ans;

    }
}
