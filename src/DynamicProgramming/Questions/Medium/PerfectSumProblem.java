package DynamicProgramming.Questions.Medium;

import java.util.Arrays;

public class PerfectSumProblem {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 3, 10};
        System.out.println(countSubSequences4(arr, 10));

    }

    public static int countSubSequences(int[] arr, int target) {
        int index = arr.length - 1;
        return recur(arr, target, index);
    }

    public static int recur(int[] arr, int target, int index) {
        if (index == 0) {
            if (arr[index] == target) {
                return 1;
            }
        }
        if (target == 0) {
            return 1;
        }
        int pick = 0;
        if (index > 0) {
            if (arr[index] <= target) {
                pick = recur(arr, target - arr[index], index - 1);
            }
            int noPick = recur(arr, target, index - 1);
            return pick + noPick;
        }
        return 0;
    }


    // Using Memoization
    public static int countSubSequences2(int[] arr, int target) {
        int index = arr.length - 1;
        int[][] dp = new int[index + 1][target + 1];
        for (int i = 0; i <= index; i++) {
            Arrays.fill(dp[i], -1);
        }
        return recurDP(arr, target, index, dp);
    }

    public static int recurDP(int[] arr, int target, int index, int[][] dp) {
        if (index == 0) {
            if (arr[0] == target) {
                dp[0][target] = 1;
                return 1;
            }
        }
        if (target == 0) {
            dp[index][0] = 1;
            return 1;
        }
        if (dp[index][target] != -1) {
            return dp[index][target];
        }
        int pick = 0;
        if (index > 0) {
            if (arr[index] <= target) {
                pick = recur(arr, target - arr[index], index - 1);
            }
            int noPick = recur(arr, target, index - 1);
            dp[index][target] = pick + noPick;
            return dp[index][target];
        }
        return 0;
    }


    // tabulation
    public static int countSubSequences3(int[] arr, int target) {
        int index = arr.length - 1;
        int[][] dp = new int[index + 1][target + 1];
        for (int t = 0; t <= target; t++) {
            if (arr[0] == t) {
                dp[0][t] = 1;
            }
        }
        for (int i = 0; i <= index; i++) {
                dp[i][0] = 1;
        }

        for (int i = 1; i <= index; i++) {
            for (int t = 1; t <= target; t++) {
                int pick = 0;
                if (arr[i] <= t) {
                    pick = dp[i - 1][t - arr[i]];
                }
                int noPick = dp[i - 1][t];
                dp[i][t] = pick + noPick;
            }
        }
        return dp[index][target];
    }


    //TODO: Still need to Dry Run
    public static int countSubSequences4(int[] arr, int target) {
        int index = arr.length - 1;
        int[] prev = new int[target + 1];
        for (int t = 0; t <= target; t++) {
            if (arr[0] == t) {
                prev[t] = 1;
            }
        }

        prev[0] = 1;
        for (int i = 1; i <= index; i++) {
            int [] curr = new int[target + 1];
            curr[0] = 1;
            for (int t = 1; t <= target; t++) {
                int pick = 0;
                if (arr[i] <= t) {
                    pick = prev[t - arr[i]];
                }
                int noPick = prev[t];
               curr[t] = pick + noPick;
            }
            prev = curr;
        }
        return prev[target];
    }
}
