package arrays.arrays2d;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                { 5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println(diagonalSum(matrix));

    }
    public static int diagonalSum(int[][] mat) {
        // bruteForce Approach
        // Time Complexity = O(n^2)
        int size  = mat.length-1;
        int totalSum =0 ;
        for(int row = 0 ; row <= mat.length-1 ; row++){
            for(int col = 0 ; col <= mat[row].length-1 ; col++){
                if(row == col || (row+col)%size == 0 ){
                    totalSum += mat[row][col];
                }
            }
        }
        return totalSum;

    }
    public static int diagonalSum2(int[][] mat) {
        // Time Complexity = O(n)
        int totalSum =0 ;
        for(int row = 0 ; row <= mat.length-1 ; row++){
            totalSum += mat[row][row];
            if(row != mat.length-1-row){
                totalSum += mat[row][mat.length-1-row];
            }
        }
        return totalSum;

    }
}
