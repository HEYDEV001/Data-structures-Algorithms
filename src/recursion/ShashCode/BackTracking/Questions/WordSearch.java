package recursion.ShashCode.BackTracking.Questions;

public class WordSearch {
    public static void main(String[] args) {

    }
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i  = 0; i < m ; i++){
            for(int j =0 ; j < n ; j++){
                if(word.charAt(0) == board[i][j]){
                    boolean isFound = search(board,word,i,j,0);
                    if(isFound) return true;
                }
            }
        }
        return false;
    }

    private static boolean search(char[][] board, String word, int row, int col , int wordIndex){
        int m = board.length;
        int n = board[0].length;
        if( wordIndex == word.length()){
            return true;
        }
        if(row<0 || row >=m ||col<0 || col>=n){
            return false;
        }
        // Invalid
        if(board[row][col] == ' ' || board[row][col] != word.charAt(wordIndex)){
            return false;
        }
        // storing for backtracking
        char ch = board[row][col];
        // mark as visited
        board[row][col] = ' ';
        if(search(board,word,row-1,col,wordIndex+1) ||
                search(board,word,row,col+1,wordIndex+1) ||
                search(board,word,row+1,col,wordIndex+1) ||
                search(board,word,row,col-1,wordIndex+1)){
            return true;
        }
        board[row][col] = ch;
        return false;
    }
}
