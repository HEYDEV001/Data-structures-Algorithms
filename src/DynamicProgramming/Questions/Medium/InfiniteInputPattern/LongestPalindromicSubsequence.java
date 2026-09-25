package DynamicProgramming.Questions.Medium.InfiniteInputPattern;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {

    }
    // Recursive
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        int n = s.length();
        return lengthOfCommonPalindrome(s, reverse, n-1, n-1);
    }
    private int lengthOfCommonPalindrome(String text1, String text2, int i , int j){
        if(i< 0 || j< 0 ){
            return 0;
        }
        if(text1.charAt(i) == text2.charAt(j)){
            return 1 + lengthOfCommonPalindrome(text1, text2, i-1, j-1);
        }else{
            int case1 = lengthOfCommonPalindrome(text1, text2, i-1, j);
            int case2 = lengthOfCommonPalindrome(text1, text2, i, j-1);
            return Math.max(case1, case2);
        }
    }


    // Memoization
    public int longestPalindromeSubseq2(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return lengthOfCommonPalindrome(s, reverse, n-1, n-1, dp);
    }
    private int lengthOfCommonPalindrome(String text1, String text2, int i , int j, int[][]dp){
        if(i==0 || j==0 ){
            dp[i][j] = 0;
            return dp[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(text1.charAt(i-1) == text2.charAt(j-1)){
            dp[i][j] = 1 + lengthOfCommonPalindrome(text1, text2, i-1, j-1, dp);
            return dp[i][j];
        }else{
            int case1 = lengthOfCommonPalindrome(text1, text2, i-1, j, dp);
            int case2 = lengthOfCommonPalindrome(text1, text2, i, j-1, dp);
            dp[i][j] = Math.max(case1, case2);
            return dp[i][j];
        }
    }

    // Tabulation
    public int longestPalindromeSubseq3(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == reverse.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    int case1 = dp[i - 1][j];
                    int case2 = dp[i][j - 1];
                    dp[i][j] = Math.max(case1, case2);
                }
            }

        }
        return dp[n][n];
    }


    // Tabulation + space Optimisation
    public int longestPalindromeSubseq4(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        int n = s.length();
        int[] prev = new int[n+1];
        for(int i  = 0 ; i <=n; i++){
            prev[i] = 0;
        }
        prev[0] = 0;
        for(int i = 1; i <=n ;i++){
            int[] current = new int[n+1];
            for(int j = 1 ; j <=n ; j++){
                if(s.charAt(i-1) == reverse.charAt(j-1)){
                    current[j] = 1 + prev[j-1];
                }else{
                    int case1 = prev[j];
                    int case2 = current[j-1];
                    current[j] = Math.max(case1, case2);
                }
            }
            prev = current;
        }
        return prev[n];
    }
}
