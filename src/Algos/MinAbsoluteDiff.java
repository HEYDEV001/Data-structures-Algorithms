package Algos;

import java.util.Arrays;

public class MinAbsoluteDiff {
    public static void main(String[] args) {
        int[] A = {1, 2, 6, 9 ,5 };
        int[] B = {2, 1, 9, 5, 6 };

        Arrays.sort(A);
        Arrays.sort(B);
        int diff = 0;
        for (int i = 0; i < A.length; i++) {
             diff = Math.abs(A[i] - B[i]);
        }
        System.out.println(diff);

    }
}
