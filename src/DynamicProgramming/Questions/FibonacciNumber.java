package DynamicProgramming.Questions;

import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib2(50));
    }
    public static int fib(int n) {
        int[] dp  = new int[n+1];
        Arrays.fill(dp, -1);
        return recur(n, dp);
    }
    // Using memoization
    public static int recur(int n, int[] dp) {
        if(n<2){
            dp[n] =n;
            return dp[n];
        }
        if(dp[n]!= -1){
            return dp[n];
        }
        dp[n] = fib(n-1) + fib(n-2);
        return dp[n];
    }

    // using bottom - up (Tabulation)
    public static int fib2(int n) {
        int[] dp  = new int[n+1];
        if(n<2){
            return n ;
        }
        dp[0] = 0;
        dp[1] = 1;
        for( int state = 2 ; state<=n;state++){
            dp[state] = dp[state-1] + dp[state-2];
        }
        return dp[n];
    }
}
