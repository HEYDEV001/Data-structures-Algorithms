package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;

public class RatInAMaze {
    public static void main(String[] args) {

    }
    public static ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        paths(0, 0, new StringBuilder(""),maze, result);
        return result;

    }
    private static void paths(int row, int col, StringBuilder current, int[][] maze, ArrayList<String> result){
        int n= maze.length;
        if(row < 0 || col < 0 || row>=n || col>=n){
            return;
        }
        // Already filled cell
        if( maze[row][col]==2 || maze[row][col]==0){
            return;
        }
        if(row==n-1 && col == n-1){
            result.add(current.toString());
            return;
        }
        // now move the rat
        maze[row][col] = 2;
        // Arranged the recursive calls in lexicographically order
        current.append("D");
        paths(row+1, col, current,  maze, result);
        current.deleteCharAt(current.length()-1);

        current.append("L");
        paths(row, col-1, current, maze, result);
        current.deleteCharAt(current.length()-1);

        current.append("R");
        paths(row, col+1, current,maze, result);
        current.deleteCharAt(current.length()-1);

        current.append("U");
        paths(row-1, col, current,maze, result);
        current.deleteCharAt(current.length()-1);
        maze[row][col] = 1;
    }
}
