package LinearSearch;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,5,3,6},
                {2,4,7,8},
                {9,2,8,6}};
        findMaximumSumSubArray(matrix);

    }
    public static void findMaximumSumSubArray(int[][] nums) {
        int maxSum = Integer.MIN_VALUE;
        int subArrayIndex =-1;
        for (int i = 0; i < nums.length; i++) {
            int currSum =0;
            for (int j = 0; j < nums[i].length; j++) {
                currSum += nums[i][j];
            }
            if(currSum > maxSum){
                maxSum = currSum;
                subArrayIndex =i;
            }
        }
        System.out.println(maxSum);
        for (int i = 0; i < nums[subArrayIndex].length; i++) {
            System.out.print(nums[subArrayIndex][i]+" ");
        }
    }
}
