package arrays.arrays2d;

public class SearchInMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,4,7},
                {2,5,8, 9, 8, 7, 7,6 , 4, 3, 17},
                {3,6,9}
        };
        System.out.println("Is present : "+searchInMatrix(matrix,17));

    }
    public static boolean   searchInMatrix(int[][] matrix, int target){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(matrix[row][col] == target){
                    System.out.println("Found at index ("+row+", "+col+")");
                    return true;
                }
            }
        }
        return false;
    }
}
