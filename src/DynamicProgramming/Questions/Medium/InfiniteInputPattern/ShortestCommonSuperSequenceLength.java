package DynamicProgramming.Questions.Medium.InfiniteInputPattern;

import java.util.Arrays;

public class ShortestCommonSuperSequenceLength {
    public static void main(String[] args) {
        String str1 = "abca";
        String str2 = "cab";
        System.out.println(shortestCommonSuperSequence3(str1, str2));

    }

    // Recursion
    public static int shortestCommonSuperSequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        return (n+m) - (lengthOfCommonSubSequence(str1, str2, n-1, m-1));
    }

    private  static int lengthOfCommonSubSequence(String text1, String text2, int i , int j){
        if(i< 0 || j< 0 ){
            return 0;
        }
        if(text1.charAt(i) == text2.charAt(j)){
            return 1 + lengthOfCommonSubSequence(text1, text2, i-1, j-1);
        }else{
            int case1 = lengthOfCommonSubSequence(text1, text2, i-1, j);
            int case2 = lengthOfCommonSubSequence(text1, text2, i, j-1);
            return Math.max(case1, case2);
        }
    }

    // Memoization
    public static int shortestCommonSuperSequence2(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp  = new int[n+1][m+1];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        return (n+m) - (lengthOfCommonSubSequence(str1, str2, n-1, m-1, dp));
    }

    private  static int lengthOfCommonSubSequence(String text1, String text2, int i , int j, int[][]dp){
        if(i== 0 || j== 0 ){
            dp[i][j] = 0;
            return dp[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(text1.charAt(i-1) == text2.charAt(j-1)){
            dp[i][j] = 1 + lengthOfCommonSubSequence(text1, text2, i-1, j-1);
            return dp[i][j];
        }else{
            int case1 = lengthOfCommonSubSequence(text1, text2, i-1, j);
            int case2 = lengthOfCommonSubSequence(text1, text2, i, j-1);
            dp[i][j] = Math.max(case1, case2);
            return dp[i][j];
        }
    }

    // Tabulation
    public static int shortestCommonSuperSequence3(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp  = new int[n+1][m+1];
        for(int i = 0; i <= n; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j <= m; j++){
            dp[0][j] = 0;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    int case1 = dp[i-1][j];
                    int case2 = dp[i][j-1];
                    dp[i][j] = Math.max(case1, case2);
                }
            }
        }
        for(int i = 0; i <= n; i++){
            System.out.println(Arrays.toString(dp[i]));
        }

        return (n+m) - dp[n][m];
    }

    // Tabulation + Space Optimisation
    public static int shortestCommonSuperSequence4(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[]prev  = new int[m+1];
        prev[0] = 0;
        for(int j = 0; j <= m; j++){
            prev[j] = 0;
        }
        for(int i = 1; i <= n; i++){
            int[] current = new int[m+1];
            for(int j = 1; j <= m; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    current[j] = 1 + prev[j-1];
                }else{
                    int case1 = prev[j];
                    int case2 = current[j-1];
                    current[j] = Math.max(case1, case2);
                }
            }
            prev = current;
        }
        return (n+m) - prev[m];
    }


}
