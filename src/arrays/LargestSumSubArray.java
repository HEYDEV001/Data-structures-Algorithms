package arrays;


public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        largestSumSubArray(arr);


    }
    public static void largestSumSubArray(int[] nums) {
      int maxSum = 0;
      int currSum=0;
      int minSum = Integer.MAX_VALUE;
        for (int i = 0; i <nums.length; i++) {
            for (int j = i; j <nums.length; j++) {
                currSum =0;
                for (int k = i; k <= j; k++) {
                   currSum+=nums[k];
                }
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
                if(currSum < minSum) {
                    minSum = currSum;
                }
                System.out.println(currSum);
            }
        }
        System.out.println("Max sum is : "+maxSum);
        System.out.println("Min sum is : "+minSum);
    }
}
