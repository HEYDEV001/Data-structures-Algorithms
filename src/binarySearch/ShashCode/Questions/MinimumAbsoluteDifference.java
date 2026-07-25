package binarySearch.ShashCode.Questions;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {2, 4, 19, 21, 26, 78, 83, 90, 95, 97};
        System.out.println(minAbsoluteDifference(arr,82));
    }
    public static int minAbsoluteDifference(int[] nums , int target){
        if(nums == null || nums.length == 0) return 0;
        int start =0;
        int end = nums.length-1;
        while(start<= end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return 0;
            }
            if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        if(end ==-1){
            return Math.abs(target-nums[0]);
        }else if(start == nums.length){
            return Math.abs(target-nums[nums.length-1]);
        }else{
            return Math.min(Math.abs(target-nums[start]),Math.abs(target-nums[end]));
        }
    }
}
