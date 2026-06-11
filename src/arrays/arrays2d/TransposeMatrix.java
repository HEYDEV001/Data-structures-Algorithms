package arrays.arrays2d;

import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}};
        transposeMatrix(matrix);
//        System.out.println(matrix.length);

    }
    public static void transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }

        }
        for (int row = 0; row < result.length; row++) {
            System.out.println(Arrays.toString(result[row]));
        }

    }
}
