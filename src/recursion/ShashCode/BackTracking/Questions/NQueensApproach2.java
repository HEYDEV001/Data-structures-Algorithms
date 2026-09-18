package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensApproach2 {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));

    }
    public static List<List<String>> solveNQueens(int n) {
        char[][] board= new char[n][n];
        for(int i =0; i<n;i++){
            Arrays.fill(board[i], '.');
        }
        List<List<String>> result = new ArrayList<>();
        positions(0 , board, result, n);
        return result;
    }

    private static void positions(int row, char[][] board, List<List<String>> result, int size) {
        if(row ==size){
            constructAnswer(board, result);
            return;
        }
        for(int col = 0; col <size ; col++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                positions(row + 1, board, result, size);
                board[row][col] = '.';
            }
        }
    }
    private static void constructAnswer(char[][] board,List<List<String>> result){
        List<String> current = new ArrayList<>();
        for(int i =0; i<board.length;i++){
            String row = new String(board[i]);
            current.add(row);
        }
        result.add(current);
    }
    private static boolean isSafe(int row, int col, char[][] board) {
        for(int i = 1 ; i <=row  ; i++){
            int r =  row - i;

            // forward-upper diagonal
            int c = col + i;
            if(c< board.length){
                if(board[r][c] == 'Q') {
                    return false;
                }
            }
            // backward-upper diagonal
            c = col-i;
            if(c >= 0 ){
                if(board[r][c] == 'Q') {
                    return false;
                }
            }
            // same column
            c= col;
            if( board[r][c] == 'Q'){
                return false;
            }

        }
        return true;
    }
}
