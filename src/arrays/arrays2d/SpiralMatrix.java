package arrays.arrays2d;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printSpiralOfMatrix(matrix);
        System.out.println(spiralOrder(matrix));

    }

    public static void printSpiralOfMatrix(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(matrix[startRow][col] + " ");
            }
            //right
            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(matrix[row][endCol]+ " ");
            }
            //bottom
            for (int col = endCol - 1; col >= startCol; col--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][col]+ " ");
            }

            //left
            for (int row = endRow - 1; row >= startRow + 1; row--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[row][startCol]+ " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int startRow =0 ;
        int startCol =0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){

            for(int col=startCol ; col <=endCol ; col++){
                list.add(matrix[startRow][col]);
            }

            for(int row=startRow+1 ; row <=endRow ; row++){
                list.add(matrix[row][endCol]);
            }

            for(int col=endCol-1 ; col >=startCol ; col--){
                if(startRow == endRow){
                    break;
                }
                list.add(matrix[endRow][col]);
            }

            for(int row=endRow-1 ; row >=startRow+1 ; row--){
                if(startCol == endCol){
                    break;
                }
                list.add(matrix[row][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return list;

    }
}
