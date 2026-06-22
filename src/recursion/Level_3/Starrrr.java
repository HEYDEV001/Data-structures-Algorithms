package recursion.Level_3;

public class Starrrr {
    public static void main(String[] args) {
        star(4,0);
        star2(1,1);
        star3(4,0);
    }
    static void star(int row , int col){
        if (row == 0) {
            return;
        }
        if(col<row){
            System.out.print("*");
            star(row,col+1);
        }else {
            System.out.println();
            star(row - 1, 0);
        }
    }

    static void star2(int row , int col){
        if (row ==5) {
            return;
        }
        if(col<=row){
            System.out.print("*");
            star2(row,col+1);
        }else {
            System.out.println();
            star2(row +1, col-row);
        }
    }
    static void star3(int row , int col){
        if (row == 0) {
            return;
        }
        if(col<row){
            star3(row,col+1);
            System.out.print("*");

        }else {
            star3(row - 1, 0);
            System.out.println();

        }
    }
}
