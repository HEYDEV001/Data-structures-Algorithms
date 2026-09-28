package DynamicProgramming.Questions.Medium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {

    }
    // Recursive
    public int uniquePaths(int m, int n) {
        return uniquePathCount(m-1, n-1);
    }
    private int uniquePathCount(int m , int n ){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        int ans = uniquePathCount( m-1, n) + uniquePathCount( m, n-1);
        return ans;
    }

    // Memoization
    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <=m; i++){
            Arrays.fill(dp[i], -1);
        }
        return uniquePathCount(m, n, dp);
    }
    private int uniquePathCount(int m , int n , int[][] dp){
        if(m==1 && n==1){
            dp[m][n] = 1;
            return dp[m][n];
        }
        if(m==0 || n==0){
            dp[m][n] = 0;
            return  dp[m][n];
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        int ans = uniquePathCount( m-1, n, dp) + uniquePathCount( m, n-1, dp);
        dp[m][n] = ans;
        return dp[m][n];
    }

    // Tabulation
    public int uniquePaths3(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <=m; i++){
            dp[i][1] = 1;
        }
        for(int j = 0 ; j <=n; j++){
            dp[1][j] = 1;
        }

        for(int i = 2; i <= m; i++){
            for(int j = 2; j <= n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m][n];
    }


    // Tabulation + Space Optimisation
    public int uniquePaths4(int m, int n) {
        int[]prev = new int[n+1];
        for(int j = 1 ; j <= n; j++){
            prev[j] = 1;
        }
        for(int i = 2; i <= m; i++){
            int[] current = new int[n+1];
            for(int j = 1; j <= n; j++){
                current[j] = prev[j] + current[j-1];
            }
            prev = current;
        }
        return prev[n];
    }

    // without current Array
    public int uniquePaths5(int m, int n) {
        int[]prev = new int[n+1];
        for(int j = 1 ; j <= n; j++){
            prev[j] = 1;
        }
        for(int i = 2; i <= m; i++){
            for(int j = 1; j <= n; j++){
                prev[j] = prev[j] + prev[j-1];
            }
        }
        return prev[n];
    }

}
