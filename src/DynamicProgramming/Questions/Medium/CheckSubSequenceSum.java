package DynamicProgramming.Questions.Medium;

public class CheckSubSequenceSum {
    public static void main(String[] args) {

    }
    // Using Recursion
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        return exists(arr, k, arr.length-1);
    }
    private boolean exists(int[] arr, int target , int index){
        // base case
        if(target == 0){
            return true;
        }
        if(index == 0){
            if(target == arr[index]) return true;
            return false;
        }
        if(target>=arr[index]){
            if(exists(arr, target-arr[index], index-1)){
                return true;
            }
        }
        return exists(arr, target, index-1);

    }

    // Using 2d - DP
    // 1-> true
    // 0-> not Visited
    // 2-> false
    public boolean checkSubsequenceSum2(int[] arr, int k) {
        int n = arr.length ;
        // code here
        int [][] dp = new int[n][k+1];
        return exists(arr, k, n-1, dp);
    }
    private boolean exists(int[] arr, int target , int index, int [][] dp){
        // base case
        if(target == 0){
            dp[index][target] = 1;
            return true;
        }
        if(index == 0){
            if(target == arr[index]){
                dp[index][target] = 1;
                return true;
            }
            return false;
        }
        if(dp[index][target] != 0){
            return (dp[index][target] != 1)? false : true;
        }
        if(target>=arr[index]){
            if(exists(arr, target-arr[index], index-1, dp)){
                dp[index][target] = 1;
                return true;
            }
        }
        dp[index][target] = exists(arr, target, index-1, dp) ? 1 : 2;
        return dp[index][target] ==1 ? true : false;

    }
}
