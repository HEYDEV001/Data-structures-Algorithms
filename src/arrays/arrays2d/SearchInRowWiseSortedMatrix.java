package arrays.arrays2d;

public class SearchInRowWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                { 5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println(searchMatrix(matrix, 13));

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int row =0 ; row<= matrix.length-1 ; row++){
            int col =0;
            int start = col;
            int end  = matrix[row].length-1;
            while(start <= end){
                int mid  = (start+end)/2;
                if(target == matrix[row][mid]){
                    return true;
                }else if(target > matrix[row][mid]){
                    start= mid+1;
                }else{
                    end = mid-1;
                }

            }

        }
        return false;
    }
}
