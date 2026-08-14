package binarySearch.ShashCode.Questions;

public class SearchMatrix {
    public static void main(String[] args) {
        int [][] mat = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}};
        System.out.println(searchMatrix(mat,8));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int rowLength = matrix[0].length;
        int colLength = matrix.length;
        int end = rowLength * colLength  - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            int row =mid/rowLength;
            int col =mid % rowLength ;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
