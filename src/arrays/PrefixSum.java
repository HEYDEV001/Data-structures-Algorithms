package arrays;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = { 1, -1, 6, -1, -1 };
        System.out.println("The maximum sum Using prefixSum Array is : "+prefixSum(arr));
    }
    public static int prefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length ];
        prefixSum[0] = arr[0];
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int p =1;p<prefixSum.length;p++){
            prefixSum[p] += prefixSum[p-1] + arr[p];
        }
        System.out.println(Arrays.toString(prefixSum));
        for (int start = 0; start< arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                currentSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    /*
    Here we've created an extra array which stores prefix sum of the subArray by using
    int[] prefixSum = new int[arr.length ];
        prefixSum[0] = arr[0];
        int maxSum = 0;
        for(int p =1;p<prefixSum.length;p++){
            prefixSum[p] += prefixSum[p-1] + arr[p];
        }

      then we have calculated the current sum of the sub array by the formula :
      currentSum = start ==0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];

      after that we have found the max sum and returned it

     */
}
