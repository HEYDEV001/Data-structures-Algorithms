package bitManipulation.ShashCode.LeetCode;

import java.util.Arrays;

public class SingleNumber3 {
    public static void main(String[] args) {
        int[] nums = {1,5,2,2,3,3,4,4};
        System.out.println(Arrays.toString(singleNumberII(nums)));

    }
    public static int[] singleNumberII(int[] nums) {
        int xorAll =0;
        for(int num : nums){
            xorAll ^=num;
        }
        int rsb = xorAll & -xorAll;
        int A =0;
        int B =0;
        for(int num : nums){
            if((num & rsb)!=0){
                A ^= num;
            }else{
                B^=num;
            }
        }
        return new int[] {A,B};
    }
}
