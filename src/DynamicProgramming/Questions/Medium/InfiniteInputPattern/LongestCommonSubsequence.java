package DynamicProgramming.Questions.Medium.InfiniteInputPattern;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {

    }
    // Recursive
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        return lengthOfCommonSubSequence(text1, text2, l1-1, l2-1);
    }
    private int lengthOfCommonSubSequence(String text1, String text2, int i , int j){
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
    public int longestCommonSubsequence2(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int[][] dp = new int[l1+1][l2+1];
        for (int i = 0; i <= l1; i++) {
            Arrays.fill(dp[i], -1);
        }
        return lengthOfCommonSubSequence(text1, text2, l1, l2, dp);
    }
    private int lengthOfCommonSubSequence(String text1, String text2, int i , int j, int[][]dp){
        if(i==0 || j==0 ){
            dp[i][j] = 0;
            return dp[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(text1.charAt(i-1) == text2.charAt(j-1)){
            dp[i][j] = 1 + lengthOfCommonSubSequence(text1, text2, i-1, j-1, dp);
            return dp[i][j];
        }else{
            int case1 = lengthOfCommonSubSequence(text1, text2, i-1, j, dp);
            int case2 = lengthOfCommonSubSequence(text1, text2, i, j-1, dp);
            dp[i][j] = Math.max(case1, case2);
            return dp[i][j];
        }
    }


    // Tabulation
    public int longestCommonSubsequence3(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int[][] dp = new int[l1+1][l2+1];
        for (int i = 0; i <= l1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= l2; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    int case1 = dp[i-1][j];
                    int case2 = dp[i][j-1];
                    dp[i][j] = Math.max(case1, case2);
                }
            }
        }
        return dp[l1][l2];
    }

    // Tabulation + space Optimisation
    public int longestCommonSubsequence4(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int[]prev = new int[l2+1];
        prev[0] = 0;
        for (int j = 0; j <= l2; j++) {
            prev[j] = 0;
        }
        for (int i = 1; i <= l1; i++) {
            int[] current = new int[l2+1];
            for (int j = 1; j <= l2; j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    current[j] = 1 + prev[j-1];
                }else{
                    int case1 = prev[j];
                    int case2 = current[j-1];
                    current[j] = Math.max(case1, case2);
                }
            }
            prev = current;
        }
        return prev[l2];
    }
}
