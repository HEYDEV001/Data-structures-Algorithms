package DynamicProgramming.Questions.Easy;

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


    // Using tabulation
    public int climbStairs3(int n) {
        int[] dp = new int[n+1];
        if(n<=2){
            return n;
        }
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3;i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    // Optimised Space
    public int climbStairs4(int n) {
        if(n<=2){
            return n;
        }
        int p1 = 1;
        int p2 = 2;
        int ans = 0;
        for(int i =3;i<=n; i++){
            ans = p2 + p1;
            p1 = p2;
            p2 = ans;
        }
        return ans;
    }

}
