package binarySearch.ShashCode.Questions;

public class FirstOccurrenceOfOne {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,1,1,1,1,1,1,1};
        System.out.println(firstOccurrenceInInfiniteSortedBinaryArray(arr, 1));


    }
    public static int firstOccurrenceInInfiniteSortedBinaryArray(int[] arr, int target) {
        int ans =-1;
        int start =0 ;
        int end  = start+1;
        while(target > arr[end]){
            int newStart = end+1;
            end = end +(end -start +1) * 2;
            start = end;
        }
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
