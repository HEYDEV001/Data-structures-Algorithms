package arrays.arrays2d;

public class SearchInSorted2dArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                { 5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
//        System.out.println(searchMatrix(matrix, 14));
        int[][] matrix2 = {{-1,3}};
        System.out.println(searchMatrix(matrix2, 3));

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        if(matrix.length == 0) return false;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }else if(target < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;

    }
}
