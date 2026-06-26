package BasicsOfJava.Recursion.Backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
         knights(board, 0,0,4);

    }

    static void knights(boolean[][] board, int row, int col, int knight) {
        if (knight == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (row == board.length - 1 && col == board.length) {
            return;
        }
        if (col == board.length) {
            knights(board, row + 1, 0, knight);
            return;
        }
        if (IsSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col + 1, knight - 1);
            board[row][col] = false;
        }
        knights(board, row, col + 1, knight);
    }

    private static boolean IsSafe(boolean[][] board, int row, int col) {
        if (IsValid(board, row-2, col-1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (IsValid(board, row-1, col-2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (IsValid(board, row-2, col+1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (IsValid(board, row-1, col+2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }

    static boolean IsValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }


    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
