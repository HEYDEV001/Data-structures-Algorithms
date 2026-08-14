package binarySearch.ShashCode.Questions.Matrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{2,2,2},{3,3,3}};
        System.out.println(Arrays.deepToString(transpose(matrix)));

    }
    public static int[][] transpose(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }
}
