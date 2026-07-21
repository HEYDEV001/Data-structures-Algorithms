package bitManipulation.ShashCode.LeetCode;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4,4};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int result =0;
        for(int index =0; index<nums.length;index++){
            result ^= nums[index];
        }
        return result;
    }
}
