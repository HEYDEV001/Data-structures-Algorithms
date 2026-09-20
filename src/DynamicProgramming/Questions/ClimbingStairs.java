package DynamicProgramming.Questions;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {

    }
    // Using Recursion
    // TC = O(N)
    // SC = O(N)
    public static int climbStairs(int n) {
        if(n<=2){
            return n ;

        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

    // Using Memoization
    public int climbStairs2(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return recur(n, dp);
    }
    public int recur(int n, int[] dp) {
        if(n<=2){
            dp[n] = n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = climbStairs(n-1) + climbStairs(n-2);
        return dp[n];
    }


}
