package DynamicProgramming.Questions.Medium.InfiniteInputPattern;

import java.util.Arrays;

public class CoinChange2 {
    public static void main(String[] args) {
        int [] arr = {1, 2,5};
        System.out.println(change2(5,arr));
    }
    // Recursive
    public static int change(int amount, int[] coins) {
        int n  = coins.length-1;
        return count(amount, coins, n);

    }
    private static int count(int amount, int[] coins, int index){
        if(index == 0 ){
            if(amount % coins[index] == 0){
                return 1;
            }else{
                return 0;
            }
        }

        int pick = 0 ;
        if(coins[index] <= amount){
            pick = count(amount - coins[index], coins, index);
        }
        int noPick = count(amount, coins, index -1);
        return pick + noPick;
    }

    // Dp(Memoization)
    public static int change2(int amount, int[] coins) {
        int n  = coins.length-1;
        int[][] dp = new int[n+1][amount+1];
        for(int i = 0; i <= n ; i++){
            Arrays.fill(dp[i], -1);
        }
        return count(amount, coins, n, dp);

    }
    private static int count(int amount, int[] coins, int index, int[][] dp){
        if(index == 0 ){
            if(amount % coins[index] == 0){
                dp[index][amount] = 1;
                return dp[index][amount];
            }else{
                dp[index][amount] =0;
                return dp[index][amount];
            }
        }
        // Check the stored Answer
        if(dp[index][amount] != -1){
            return dp[index][amount];
        }
        int pick = 0 ;
        if(coins[index] <= amount){
            pick = count(amount - coins[index], coins, index, dp);
        }
        int noPick = count(amount, coins, index -1, dp);
        dp[index][amount] = pick + noPick;
        return dp[index][amount];
    }

    // Dp(Tabulation)
    public static int change3(int amount, int[] coins) {
        int n  = coins.length-1;
        int[][] dp = new int[n+1][amount+1];
        for(int a = 0; a <= amount ; a++){
            if(a % coins[0] == 0){
                dp[0][a] = 1;
            }else{
                dp[0][a] =0;
            }
        }
        for(int i = 1; i <= n ; i++){
            for(int a = 0; a <= amount ; a++){
                int pick = 0 ;
                if(coins[i] <= a){
                    pick = dp[i][a-coins[i]];
                }
                int noPick = dp[i-1][a];
                dp[i][a] = pick + noPick;
            }
        }
        return dp[n][amount];

    }


    // Dp(Tabulation + Space Optimisation)
    public static int change4(int amount, int[] coins) {
        int n  = coins.length-1;
        int[]prev = new int[amount+1];
        for(int a = 0; a <= amount ; a++){
            if(a % coins[0] == 0){
                prev[a] = 1;
            }else{
                prev[a] =0;
            }
        }
        for(int i = 1; i <= n ; i++){
            int[] current = new int[amount +1];
            for(int a = 0; a <= amount ; a++){
                int pick = 0 ;
                if(coins[i] <= a){
                    pick = current[a-coins[i]];
                }
                int noPick = prev[a];
                current[a] = pick + noPick;
            }
            prev = current;
        }
        return prev[amount];

    }
}
