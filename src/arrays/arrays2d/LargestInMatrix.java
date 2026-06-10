package arrays.arrays2d;

public class LargestInMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
            {1,4,7},
            {2,5,8, 9, 8, 7, 7,6 , 4, 3, 17},
            {3,6,9}
    };
        System.out.println("The largest in the matrix is :"+ findLargest(matrix));

    }
    public static int findLargest(int[][] matrix) {
        int max=0;
        for(int row =0 ; row < matrix.length ; row++) {
            for(int col=0;col<matrix[row].length;col++){
                max= Math.max(matrix[row][col], max);
            }
        }
        return max;
    }
}
