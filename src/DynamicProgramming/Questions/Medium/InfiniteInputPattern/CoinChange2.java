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


}
