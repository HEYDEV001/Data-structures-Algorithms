package DynamicProgramming.Questions.Medium;

import java.util.Arrays;

public class CountSubSetsWithSum {
    public static void main(String[] args) {

    }
    static int perfectSum(int[] arr, int target) {
        return recur(arr, target, arr.length-1);

    }

    public static  int recur(int [] arr, int target, int index) {
        if(index == 0){
            if(arr[0] == target && target ==0) return 2;
            else if(target ==0 ) return 1;
            else if(target == arr[index]) return 1;
            else return 0;
        }
        int  pick =0;
        if(arr[index] <= target){
            pick = recur(arr, target-arr[index], index-1);

        }
        int noPick = recur(arr, target, index-1);
        return noPick + pick;
    }


    static int perfectSum2(int[] arr, int target) {

        // code here
        int index = arr.length-1;
        int[][] dp = new int[index+1][target+1];
        for(int i  = 0 ; i <= index ; i++){
            Arrays.fill(dp[i], -1);
        }
        return recur(arr, target, arr.length-1, dp);

    }

    public static  int recur(int [] arr, int target, int index, int[][] dp ) {
        if(index == 0){
            if(arr[0] == target && target ==0){
                dp[index][target] =2;
                return dp[index][target];
            }
            else if(target ==0 ) {
                dp[index][target] =1;
                return dp[index][target];
            }
            else if(target == arr[index]){
                dp[index][target] =1;
                return dp[index][target];
            }
            else{
                dp[index][target] =0;
                return dp[index][target];
            }
        }
        if(dp[index][target] != -1){
            return dp[index][target];
        }
        int  pick =0;
        if(arr[index] <= target){
            pick = recur(arr, target-arr[index], index-1,dp);

        }
        int noPick = recur(arr, target, index-1,dp);
        dp[index][target] = noPick + pick;
        return dp[index][target];
    }


    // Tabulation
    static int perfectSum3(int[] arr, int target) {

        // code here
        int index = arr.length-1;
        int[][] dp = new int[index+1][target+1];
        for(int t = 0 ; t<= target; t++){
            if(arr[0] == 0 && t ==0){
                dp[0][t] =2;
            }
            else if(t ==0 ) {
                dp[0][t] =1;
            }
            else if(t == arr[0]){
                dp[0][t] =1;
            }
            else{
                dp[0][t] =0;
            }
        }
        for(int i  = 1 ; i <= index ; i++){
            for( int t = 0 ; t <= target ; t++ ){
                int  pick =0;
                if(arr[i] <= t){
                    pick = dp[i-1][t-arr[i]];
                }
                int noPick = dp[i-1][t];
                dp[i][t] = noPick + pick;
            }
        }
        return dp[index][target];

    }
}
