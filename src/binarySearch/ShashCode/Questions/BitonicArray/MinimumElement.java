package binarySearch.ShashCode.Questions.BitonicArray;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,5,3,2,1,0};
        System.out.println(findMinimum(arr));
    }
    public static int findMinimum(int[] nums) {
//        return Math.min(nums[0], nums[nums.length - 1]);
        if(nums == null || nums.length == 0) return -1;
        return (nums[0] > nums[nums.length-1]) ? nums[nums.length-1] : nums[0];
    }
}
