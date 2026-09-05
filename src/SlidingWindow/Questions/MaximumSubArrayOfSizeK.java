package SlidingWindow.Questions;

public class MaximumSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        System.out.println(maxSum(arr, 2));
    }

    public static int maxSum(int[] nums, int k) {
        int n = nums.length;
        if (nums == null || nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < k ; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = 1; i < n - k +1; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
