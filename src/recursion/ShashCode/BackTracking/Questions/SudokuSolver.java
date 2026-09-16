package recursion.ShashCode.BackTracking.Questions;

public class SudokuSolver {
    public static void main(String[] args) {

    }
    public void solveSudoku(char[][] board) {
        solve( board,0,0);
    }
    private boolean solve(char[][] board, int row, int col){
        if(col==9){
            col=0;
            row = row+1;
        }
        if(row == 9){
            return true;
        }
        // If the position is already filled
        if(board[row][col] != '.'){
            return solve(board, row, col+1);
        }
        for(int d = 1 ; d<=9; d++){
            char digit = (char)(d+'0');
            if(isPlacementPossible(board, digit, row, col)){
                board[row][col]=digit;
                if(solve(board, row, col+1)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }

    private boolean isPlacementPossible(char[][] board, char digit, int row, int col){
        for(int j =0 ; j<9;j++){
            // current col
            if(board[j][col]==digit) return false;
            // current row
            if(board[row][j]== digit) return false;

            int r = 3*(row/3) + (j/3);
            int c = 3*(col/3)+(j%3);
            if(board[r][c]== digit) return false;

        }
        return true;
    }
}
