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
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }
        return uniquePathCount(m-1, n-1, dp);
    }
    private int uniquePathCount(int m , int n , int[][] dp){
        if(m==0 && n==0){
            dp[m][n] = 1;
            return dp[m][n];
        }
        if(m<0 || n<0){
            return 0;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        int ans = uniquePathCount( m-1, n) + uniquePathCount( m, n-1);
        dp[m][n] = ans;
        return dp[m][n];
    }


}
