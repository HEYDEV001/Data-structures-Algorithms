package patterns;
/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 */
public class Pattern28 {
    public static void main(String[] args) {
Pattern(5);
    }
    static void Pattern (int n) {
        for(int row = 0 ; row < 2 * n ; row++){
            int TotalColNumber = row > n ? 2 * n - row : row;

            int NoOfspaces = n - TotalColNumber;
            for (int s = 0 ; s < NoOfspaces ; s++){
                System.out.print(" ");
            }
            for(int col = 0 ; col < TotalColNumber; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
