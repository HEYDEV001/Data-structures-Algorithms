package DynamicProgramming.Questions.Medium;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {

    }
    // Using Recursion
     public int rob(int[] nums) {
         int n = nums.length-1;
         return recur(nums, n);
     }
     private int recur(int[] nums , int index){
         if(index == 0){
             return nums[0];
         }
         if(index == -1){
             return 0;
         }
         int pick = nums[index] + recur(nums, index-2);
         int noPick = recur(nums, index-1);
         return Math.max(pick , noPick);
     }

    // Using Dp (Memoization)
    public int rob2(int[] nums) {
        int n = nums.length-1;
        int[] dp  = new int[n+1];
        Arrays.fill(dp,-1);
        return recur(nums, n, dp);
    }
    private int recur(int[] nums , int index, int[] dp){
        if(index == 0){
            dp[index] = nums[0];
            return dp[index];
        }
        if(index == -1){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int pick = nums[index] + recur(nums, index-2, dp);
        int noPick = recur(nums, index-1, dp);
        dp[index] = Math.max(pick , noPick);
        return dp[index];
    }
}
