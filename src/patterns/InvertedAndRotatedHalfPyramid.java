package patterns;

public class InvertedAndRotatedHalfPyramid {
    public static void main(String[] args) {

//        halfAndRotatedPyramid(7);
//        halfInvertedPyramidWithNumbers(5);
//        floydTriangle(5);
        oneZeroTriangle(5);
//        butterfly(4);
//        rhombus(5);
//        hollowRhombus(5);
//        diamond(5);
        numbersPyramid(5);
        palindromicNumberPyramid(5);
    }

    public static void halfAndRotatedPyramid(int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if(col<=(size - row)){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void halfInvertedPyramidWithNumbers(int size){
        for(int row = 1; row<= size ; row++){
            for(int col = 1; col <= (size-row)+1; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int size){
        int numberToBePrinted = 1;
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(numberToBePrinted+" ");
                numberToBePrinted++;
            }
            System.out.println();
        }
    }

    public static void oneZeroTriangle(int size){
// In this we saw the pattern that at the place or cell,
// where 1 is present those cells have the sum of their row and column as even and other cells are odd(0 is printed there)

        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= row; col++){
                if((row+col)%2==0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int size){
        for(int row = 1 ; row<=size ; row++){
            for (int col =1 ;col<=row ; col++){
                System.out.print("*");
            }
            for(int col =1 ; col<=(2*(size-row) ); col++){
                System.out.print(" ");
            }
            for (int col =1 ;col<=row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int invertedRow = size; invertedRow>=1 ; invertedRow--){
            for (int col =1 ;col<=invertedRow ; col++){
                System.out.print("*");
            }
            for(int col =1 ; col<=(2*(size-invertedRow) ); col++){
                System.out.print(" ");
            }
            for (int col =1 ;col<=invertedRow ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rhombus(int size){
        for (int row = 1; row <= size; row++){
            for(int spaces =1; spaces<=size-row; spaces++){
                System.out.print(" ");
            }
            for (int col = 1; col <= size; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int size){
        for(int row = 1; row <= size; row++){
            for(int spaces =1; spaces<=size-row; spaces++){
                System.out.print(" ");
            }
            for(int col = 1 ; col<=size ; col++){
                if(row==1 || row==size || col==1 || col==size){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int size){
        for (int row = 1 ; row<= size ; row++){
            for(int spaces =1; spaces<=size-row; spaces++){
                System.out.print(" ");
            }
            for (int col = 1; col<=2*(row) -1; col++){
                    System.out.print("*");
            }
            System.out.println();
        }
        for(int invertedRow = size-1; invertedRow>=1; invertedRow--){
            for(int spaces =1; spaces<=size-invertedRow; spaces++){
                System.out.print(" ");
            }
            for (int col = 1; col<=2*(invertedRow) -1 ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numbersPyramid(int size){
        // To print pyramid or shapes which have spaces before printing anything or between or inside any shape
        // we need a separate loop for that
        // In this we will print the number by the rule: (2*row -1)
        // At the even columns we printed spaces
        for (int row = 1; row<=size;row++){
            for(int spaces =1; spaces<=size-row; spaces++){
                System.out.print(" ");
            }
            for(int col = 1; col<=2*row-1; col++){
                if(col%2==0){
                    System.out.print(" ");
                }else {
                    System.out.print(row);
                }

            }

            System.out.println();
        }
    }

}
