package arrays.arrays2d;

public class SmallestInMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,4,7},
                {2,5,8, 9, 8, 7, 7,6 , 4, 3, -17},
                {3,6,9}
        };
        System.out.println("The Smallest in the matrix is : "+ smallestInMatrix(matrix));

    }
    public static int smallestInMatrix(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for(int row =0; row<matrix.length;row++){
            for(int col =0 ; col<matrix[row].length; col++){
               min =  Math.min(matrix[row][col], min);
            }
        }
        return min;
    }
}
