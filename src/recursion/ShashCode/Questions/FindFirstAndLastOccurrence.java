package recursion.ShashCode.Questions;

import java.util.Arrays;

public class FindFirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 6, 7, 2, 9, 10};
        System.out.println(Arrays.toString(findFirstAndLastOccurrence(arr, 2)));
    }
    public static int[] findFirstAndLastOccurrence(int[] arr, int target ) {
        int[] res = {-1, -1};
        getTheOccurrence(arr, target, res, 0);
        return res;
    }

    private static void getTheOccurrence(int[] arr, int target, int[] res, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            res[1] = i;
        }
        getTheOccurrence(arr, target, res, i + 1);
        if(arr[i] == target)
            res[0] = i;
    }
    // TODO : Find the alternate ways to solve this exact question using recursion only
}
