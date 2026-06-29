package patterns;
   /*
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *
    */
public class FIFTH {
    public static void main(String[] args) {
Pattern(5);
    }
    static void Pattern (int n) {
        for(int rows = 1 ; rows <=2*n ; rows++){
            int TotalColNumber = rows>n ?2*n-rows:rows;
            for(int col = 1 ; col<=TotalColNumber; col++){
                System.out.print("*  ");

            }
            System.out.println();
        }
    }
}
