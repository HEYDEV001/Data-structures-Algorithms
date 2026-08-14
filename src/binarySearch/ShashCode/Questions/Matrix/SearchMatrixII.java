package binarySearch.ShashCode.Questions.Matrix;

public class SearchMatrixII {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}};
        System.out.println(searchMatrix(mat, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        int rows = 0;
        int cols = totalCols - 1;
        while (rows < totalRows && cols >= 0) {
            if (matrix[rows][cols] == target) {
                return true;
            } else if (matrix[rows][cols] > target) {
                cols--;
            } else {
                rows++;
            }
        }
        return false;
    }
}
