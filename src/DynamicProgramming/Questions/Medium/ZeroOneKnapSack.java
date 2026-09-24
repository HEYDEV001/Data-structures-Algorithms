package DynamicProgramming.Questions.Medium;

import java.util.Arrays;

public class ZeroOneKnapSack {
    public static void main(String[] args) {

    }
    // Using Recursion
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n  = val.length;
        return finalCapacity(W,  val,  wt, n-1);

    }
    private int finalCapacity(int cap, int val[], int wt[], int index){
        if(index==0){
            if(wt[index] <= cap){
                return val[index];
            }else{
                return 0;
            }
        }
        if(cap == 0) return 0;

        int pick = 0;
        if(wt[index] <= cap){
            pick = val[index] + finalCapacity(cap- wt[index],  val,  wt,  index-1);
        }
        int noPick =finalCapacity(cap,  val,  wt,  index-1);
        return Math.max(pick, noPick);
    }


    // DP(Memoization)
    public int knapsack2(int W, int val[], int wt[]) {
        // code here
        int n  = val.length;
        int[][] dp = new int[n][W+1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return finalCapacity(W,  val,  wt, n-1, dp);

    }
    private int finalCapacity(int cap, int val[], int wt[], int index, int[][] dp){
        if(index==0){
            if(wt[index] <= cap){
                dp[index][cap] = val[index];
                return dp[index][cap];
            }else{
                dp[index][cap] = 0;
                return dp[index][cap];
            }
        }
        if(cap == 0){
            dp[index][cap] = 0;
            return dp[index][cap];
        }
        if(dp[index][cap] != -1){
            return dp[index][cap];
        }
        int pick = 0;
        if(wt[index] <= cap){
            pick = val[index] + finalCapacity(cap- wt[index],  val,  wt,  index-1, dp);
        }
        int noPick =finalCapacity(cap,  val,  wt,  index-1, dp);
        dp[index][cap] = Math.max(pick, noPick);
        return dp[index][cap];
    }
}
