package bitManipulation.ShashCode.LeetCode;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4,4};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int singleNumber =0;
        for(int single: nums){
            singleNumber ^= single;
        }
        return singleNumber;
    }
}
