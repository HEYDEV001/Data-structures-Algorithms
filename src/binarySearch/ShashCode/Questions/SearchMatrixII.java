package binarySearch.ShashCode.Questions;

public class SearchMatrixII {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}};
        System.out.println(searchMatrix(mat, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = 0;
        int cols = matrix[0].length - 1;
        while (rows < matrix.length && cols >= 0) {
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
