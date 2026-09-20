package DynamicProgramming.Questions;

import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(37));
    }
    public static int fib(int n) {
        int[] dp  = new int[n+1];
        Arrays.fill(dp, -1);
        return recur(n, dp);
    }
    // Using dp
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
}
