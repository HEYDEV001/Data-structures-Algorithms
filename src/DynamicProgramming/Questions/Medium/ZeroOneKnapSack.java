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

    // DP(Tabulation)
    public int knapsack3(int cap, int val[], int wt[]) {
        // code here
        int n  = val.length-1;
        int[][] dp = new int[n+1][cap+1];
        for (int c = 0; c <= cap; c++) {
            if(wt[0] <= c){
                dp[0][c] = val[0];
            }else{
                dp[0][c] = 0;
            }
        }
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int c = 1; c <= cap; c++) {
                int pick = 0;
                if(wt[i] <= c){
                    pick = val[i] +  dp[i-1][c-wt[i]];
                }
                int noPick =  dp[i-1][c];
                dp[i][c] = Math.max(pick, noPick);
            }
        }
        return dp[n][cap];

    }

    // DP(Tabulation + Space Optimisation)
    public int knapsack4(int cap, int val[], int wt[]) {
        // code here
        int n  = val.length-1;
        int[]prev = new int[cap+1];
        for (int c = 0; c <= cap; c++) {
            if(wt[0] <= c){
                prev[c] = val[0];
            }else{
                prev[c] = 0;
            }
        }
        for (int i = 1; i <= n; i++) {
            prev[0] = 0;
        }
        for (int i = 1; i <= n; i++) {
            int[] current = new int[cap+1];
            for (int c = 1; c <= cap; c++) {
                int pick = 0;
                if(wt[i] <= c){
                    pick = val[i] +  prev[c-wt[i]];
                }
                int noPick =  prev[c];
                current[c] = Math.max(pick, noPick);
            }
            prev = current;
        }
        return prev[cap];

    }
}
