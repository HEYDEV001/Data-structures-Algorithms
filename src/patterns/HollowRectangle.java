package patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        hollowRectangle(7, 17);
    }

    public static void hollowRectangle(int totalRows, int totalColumns){
        for(int row = 1 ; row <= totalRows ; row++){
            for(int column = 1 ; column <= totalColumns ; column++){
                if(row == 1 || row == totalRows || column == 1 || column == totalColumns){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
