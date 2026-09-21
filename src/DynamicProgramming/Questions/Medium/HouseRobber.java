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
     // Bottom-up (Tabulation)
     // Used Shifting of dp array
     // dp[1] = nums[0] -> dp[index] = nums[index-1] or dp[index+1] = nums[index]
     public int rob3(int[] nums) {
         int n = nums.length;
         int[] dp  = new int[n+1];
         if(n == 0){
             return nums[0];
         }
         if(n == -1){
             return 0;
         }
         dp[1] = nums[0];
         dp[0]  = 0;
         for(int state =2; state<=n ; state++){
             int pick = nums[state-1] + dp[state-2];
             int noPick = dp[state-1];
             dp[state] = Math.max(pick , noPick);
         }
         return dp[n];
     }

    // Bottom-up (Tabulation)(Space Optimization)
    // Used Shifting of dp array
    // dp[1] = nums[0] -> dp[index] = nums[index-1] or dp[index+1] = nums[index]
    public int rob4(int[] nums) {
        int n = nums.length-1;
        if(n == 0){
            return nums[0];
        }
        if(n == -1){
            return 0;
        }
        int previous = nums[0];
        int beforePrevious  = 0;
        int ans = 0;
        for(int state =2; state<=n+1 ; state++){
            int pick = nums[state-1] + beforePrevious;
            int noPick = previous;
            ans = Math.max(pick , noPick);
            beforePrevious = previous;
            previous  = ans ;

        }
        return ans;
    }
}
