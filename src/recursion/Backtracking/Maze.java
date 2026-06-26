package BasicsOfJava.Recursion.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countNoOfWays(3,3));
        path("",3,3);
        System.out.println(pathret("",3,3));
        System.out.println(pathretDiagonal("",3,3));


        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, false, true}
        };
        boolean[][] board2 = {
                {true, false, true,true},
                {true, true, true,false},
                {true, false, true,true},
                {true, true, true,true}
        };
      pathrestrictions("",board2,0,0);
    }
    static int countNoOfWays(int row , int col) {
        if (row == 1 || col == 01) {
            return 1;
        }
        int left = countNoOfWays(row - 1, col);
        int right = countNoOfWays(row , col-1);
        return left + right;
    }

// This prints the path that it follows to reach the last index
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return ;
        }
       if(r>1){
           path(p +'D', r - 1, c);
       }
        if(c>1){
            path(p + 'R', r , c-1);
        }
    }



//This will return the paths in the Array list
    static ArrayList<String> pathret(String p, int r, int c) {
        if (r == 1 && c == 1) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathret(p +'D', r - 1, c));
        }
        if(c>1){
            list.addAll(pathret(p + 'R', r , c-1));
        }
        return list;
    }




// This is for having the Diagonal as a path so if you can also go diagonally the paths are as follows just add one more check for r-1 and c-1
    static ArrayList<String> pathretDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathretDiagonal(p +'D', r - 1, c-1));
        }
        if(r>1){
            list.addAll(pathretDiagonal(p +'V', r - 1, c));
        }
        if(c>1){
            list.addAll(pathretDiagonal(p + 'H', r , c-1));
        }
        return list;
    }




// this is with restrictions on the path of the maze
    // we will make the board and give any position false that is the restriction
    // and this one is also starting from 0,0 to the size of the maze you give it to
    // we have made the boolean boards to make the maze and the restrictions in it
    static void pathrestrictions(String p, boolean[][]maze,int  r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return ;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            pathrestrictions(p +'D', maze,r + 1, c);
        }
        if(c<maze[0].length-1){
            pathrestrictions(p + 'R', maze, r , c+1);
        }
    }
}
