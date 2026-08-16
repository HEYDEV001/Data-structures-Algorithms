package binarySearch.ShashCode.Questions.Matrix;

import java.util.Arrays;

public class GenerateSpiralMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(4)));

    }
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;
        int num =1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                result[startRow][i] = num;
                num++;
            }
            startRow++;
            for (int i = startRow; i <= endRow; i++) {
                result[i][endCol] = num;
                num++;
            }
            endCol--;
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    result[endRow][i] =num;
                    num++;
                }
                endRow--;
            }
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    result[i][startCol]= num;
                    num++;
                }
                startCol++;
            }
        }
        return result;
    }
}
