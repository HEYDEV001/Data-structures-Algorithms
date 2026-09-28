package DynamicProgramming.Questions.Medium;

import java.util.Arrays;

public class UniquePaths2 {
    public static void main(String[] args) {

    }
    public int uniquePaths(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return uniquePathCount(m-1, n-1, obstacleGrid);
    }
    private int uniquePathCount(int m , int n , int[][] obstacleGrid){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if(obstacleGrid[m][n]==1){
            return 0;
        }
        int ans = uniquePathCount( m-1, n, obstacleGrid) + uniquePathCount( m, n-1, obstacleGrid);
        return ans;
    }


    // Memoization
    public int uniquePaths2(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <=m; i++){
            Arrays.fill(dp[i], -1);
        }
        return uniquePathCount(m, n, obstacleGrid, dp);
    }
    private int uniquePathCount(int m , int n , int[][] obstacleGrid, int[][]dp){

        if(m==0 || n==0){
            dp[m][n] = 0;
            return 0;
        }
        if(obstacleGrid[m-1][n-1]==1){
            dp[m][n] = 0;
            return 0;
        }
        if(m==1 && n==1){
            dp[m][n] = 1;
            return 1;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        int ans = uniquePathCount( m-1, n, obstacleGrid, dp) + uniquePathCount( m, n-1, obstacleGrid, dp);
        dp[m][n] = ans;
        return dp[m][n];
    }

}
