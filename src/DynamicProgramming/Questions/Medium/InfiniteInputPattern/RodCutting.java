package DynamicProgramming.Questions.Medium.InfiniteInputPattern;

import java.util.Arrays;

public class RodCutting {
    public static void main(String[] args) {


    }

    // Recursive
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        return maxValue(price, n-1, n);
    }

    private int maxValue(int[] price, int index, int n){
        if(index == 0){
            return  n * price[index];
        }
        int pick  = 0;
        int currentLength = index + 1;
        if(n >= currentLength){
            pick = price[index] +  maxValue(price, index, n - currentLength);
        }
        int noPick = maxValue(price, index-1, n);
        return Math.max(pick , noPick);
    }


    // Memoization
    public int cutRod2(int[] price) {
        // code here
        int n = price.length;
        int [][]dp = new int[n][n+1];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        return maxValue(price, n-1, n, dp);
    }

    private int maxValue(int[] price, int index, int n, int[][] dp){
        if(index == 0){
            dp[index][n] = n * price[index];
            return  dp[index][n];
        }
        if(dp[index][n] != -1){
            return dp[index][n];
        }
        int pick  = 0;
        int currentLength = index + 1;
        if(n >= currentLength){
            pick = price[index] +  maxValue(price, index, n - currentLength);
        }
        int noPick = maxValue(price, index-1, n);
        dp[index][n] = Math.max(pick , noPick);
        return dp[index][n];
    }

    // Tabulation
    public int cutRod3(int[] price) {
        // code here
        int n = price.length;
        int [][]dp = new int[n][n+1];
        for(int l = 0;  l<n+1; l++){
            dp[0][l] = l * price[0];
        }
        for(int i = 1; i < n; i++){
            for(int l = 0; l <= n; l++){
                int pick  = 0;
                int currentLength = i + 1;
                if(l >= currentLength){
                    pick = price[i] + dp[i][l-currentLength];
                }
                int noPick = dp[i-1][l];
                dp[i][l] = Math.max(pick , noPick);
            }
        }
        return dp[n-1][n];
    }

    // Tabulation + space Optimisation
    public int cutRod4(int[] price) {
        // code here
        int n = price.length;
        int []prev = new int[n+1];
        for(int l = 0;  l<n+1; l++){
            prev[l] = l * price[0];
        }
        for(int i = 1; i < n; i++){
            int[] current = new int[n+1];
            for(int l = 0; l <= n; l++){
                int pick  = 0;
                int currentLength = i + 1;
                if(l >= currentLength){
                    pick = price[i] + current[l-currentLength];
                }
                int noPick = prev[l];
                current[l] = Math.max(pick , noPick);
            }
            prev = current;
        }
        return prev[n];
    }

}
