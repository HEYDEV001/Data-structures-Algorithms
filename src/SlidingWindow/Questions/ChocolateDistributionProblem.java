package SlidingWindow.Questions;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int [] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        System.out.println(findMinDiff(arr,5));


    }
    public static int findMinDiff(int arr[], int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int minDiff = arr[k-1] - arr[0];
        for (int i = 1; i < n-k+1; i++) {
            minDiff = Math.min(minDiff, arr[i+k-1] - arr[i]);
        }
        return minDiff;

    }
}
