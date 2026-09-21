package DynamicProgramming.Questions;

import java.util.Arrays;

public class MinCostClimbingStairs {
    public static void main(String[] args) {

    }
    // Using recursion only
     public int minCostClimbingStairs(int[] cost) {
         int n =  cost.length;
         return recur(cost,n);

     }
     public int recur(int[] cost, int index){
         if(index==0 || index ==1){
             return 0;
         }
         int oneStep = cost[index-1] + recur(cost, index-1);
         int twoStep = cost[index-2] + recur(cost, index-2);
         return Math.min(oneStep, twoStep);
     }

    // Top-down (Using Memoization)
    public int minCostClimbingStairs2(int[] cost) {
        int n  =  cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return recur(cost,n, dp);

    }
    public int recur(int[] cost, int index, int[] dp){
        if(index==0 || index ==1){
            dp[index] =0;
            return dp[index];
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int oneStep = cost[index-1] + recur(cost, index-1, dp);
        int twoStep = cost[index-2] + recur(cost, index-2, dp);
        dp[index] = Math.min(oneStep, twoStep);
        return dp[index];
    }

    // // bottom-up
     public int minCostClimbingStairs3(int[] cost) {
         int n  =  cost.length;
         int[] dp = new int[n+1];
         if(n == 0 || n == 1){
             return 0;
         }
         dp[0] = 0;
         dp[1] = 0;
         for( int state = 2; state <=n; state++){
             dp[state] = Math.min((cost[state-1]  +  dp[state-1]), (cost[state-2]  +  dp[state-2]));
         }
         return dp[n];
     }

    // bottom-up (Space Optimised)
    public int minCostClimbingStairs4(int[] cost) {
        int n  =  cost.length;
        if(n == 0 || n == 1){
            return 0;
        }
        int prev0 = 0;
        int prev1 = 0;
        int ans = 0;
        for( int state = 2; state <=n; state++){
            ans= Math.min((cost[state-1]  +  prev1), (cost[state-2]  +  prev0));
            prev0 = prev1;
            prev1 = ans;
        }
        return ans;
    }

}
