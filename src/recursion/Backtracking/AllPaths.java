package BasicsOfJava.Recursion.Backtracking;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}

        };
        AllPathsBackTracking("", board, 0, 0);

    }

    static void AllPaths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            AllPaths(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            AllPaths(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            AllPaths(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            AllPaths(p + 'L', maze, r, c - 1);
        }
    }

/*
This program will show stack overflow because it is ending up on the same point from where it was started
So, In order to solve this problem we shoud mark those cells which are visited already so do not go back to those cell again
when we mark the cells as false as moving from the current path the cells for the next path are also marked as false
this will creat a problem that it will not allow it to go the false cell
So, As we move backward (removing from stack )we have to restore the cells to true
 */
/*
Backtracking : when you are making the recursion calls some changes are made
 while going back to previous recursion call the changes should not be there
 */



static void AllPathsBackTracking(String p, boolean[][] maze, int r, int c) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
        System.out.println(p);
        return;
    }
    if (!maze[r][c]) {
        return;
    }
    // here I am changing the cells to false so, it will not go back to the visited cell
    maze[r][c] = false;
    if (r < maze.length - 1) {
        AllPathsBackTracking(p + 'D', maze, r + 1, c);
    }
    if (c < maze[0].length - 1) {
        AllPathsBackTracking(p + 'R', maze, r, c + 1);
    }
    if (r > 0) {
        AllPathsBackTracking(p + 'U', maze, r - 1, c);
    }
    if (c > 0) {
        AllPathsBackTracking(p + 'L', maze, r, c - 1);
    }
    // here the recursion calls are over
    // so before the function gets removed ,remove all the changes that were made by that function
    maze[r][c] = true;
}
}