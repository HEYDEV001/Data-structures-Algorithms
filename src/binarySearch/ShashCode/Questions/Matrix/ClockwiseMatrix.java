package binarySearch.ShashCode.Questions.Matrix;

import java.util.Arrays;

public class ClockwiseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{2,2,2},{3,3,3}};
        System.out.println(Arrays.deepToString(clockwise(matrix)));
    }
    public static int[][] clockwise(int[][] matrix) {
        int m = matrix.length;
        matrix = transpose(matrix);
        for(int i=0; i<m/2; i++) {
            for(int j=0; j<m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m-1-i][j];
                matrix[m-2-i][j ] = temp;
            }
        }
        return matrix;

    }
    public static int[][] transpose(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        for (int i = 0; i < m; i++) {
            // here we will run the inner loop i times because in each row on i times element needed to be swapped.
            for (int j = 0; j < i; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }
}
