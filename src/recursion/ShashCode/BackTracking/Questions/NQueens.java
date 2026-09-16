package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {

    }
    public static List<List<String>> solveNQueens(int n) {
        char[][] board= new char[n][n];
        for(int i =0; i<n;i++){
            Arrays.fill(board[i], '.');
        }
        List<List<String>> result = new ArrayList<>();
        positions(0 , board, result);
        return result;
    }
    public static void positions(int col ,char[][] board, List<List<String>> result){
        int n = board.length;
        if(col==n){
            constructAnswer(board, result);
            return;
        }
        for(int row = 0; row<n ; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                positions(col+1 , board, result);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board,int r, int c){
        for(int k =1 ; k <= c ;k++){
            int col = c-k;
            // upper diagonal
            int row = r-k;
            if(row>=0){
                if(board[row][col]=='Q') return false;
            }

            // Lower diagonal
            row = r+k;
            if(row<board.length){
                if(board[row][col]=='Q') return false;
            }

            //same row
            row = r;
            if(board[row][col]=='Q') return false;

        }
        return true;
    }

    private static void constructAnswer(char[][] board,List<List<String>> result){
        List<String> current = new ArrayList<>();
        for(int i =0; i<board.length;i++){
            String row = new String(board[i]);
            current.add(row);
        }
        result.add(current);
    }
}
