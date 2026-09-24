package DynamicProgramming.Questions.Medium.InfiniteInputPattern;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {

    }
    // Using Recursion
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length -1;
        int res = result(coins, amount, n);
        if(res == (int)(1e9)){
            return -1;
        }else{
            return res;
        }
    }
    private static int result(int[] coins, int amount, int index){
        if(index == 0){
            if(amount % coins[index] == 0){
                return amount/coins[0];
            }
            return (int)(1e9);
        }
        if(amount == 0){
            return (int)(1e9);
        }
        int pick = (int)(1e9);
        if(coins[index] <= amount){
            pick = 1 + result(coins, amount - coins[index], index);
        }
        int noPick = result(coins, amount, index-1);
        return Math.min(pick, noPick);
    }

    // Using DP(Memoization)
    public static int coinChange2(int[] coins, int amount) {
        int n = coins.length -1;
        int[][] dp = new int[n+1][amount + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int res = result(coins, amount, n, dp);
        if(res == (int)(1e9)){
            return -1;
        }else{
            return res;
        }
    }
    private static int result(int[] coins, int amount, int index, int[][] dp){
        if(index == 0){
            if(amount % coins[index] == 0){
                dp[index][amount] = amount/coins[0];
                return dp[index][amount];
            }
            dp[index][amount] = (int)(1e9);
            return dp[index][amount];
        }
        if(dp[index][amount] != -1){
            return dp[index][amount];
        }
        int pick = (int)(1e9);
        if(coins[index] <= amount){
            pick = 1 + result(coins, amount - coins[index], index, dp);
        }
        int noPick = result(coins, amount, index-1, dp);
        dp[index][amount] = Math.min(pick, noPick);
        return dp[index][amount];
    }
}
