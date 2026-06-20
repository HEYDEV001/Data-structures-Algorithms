package recursion.Level_1;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(pro(50555));
    }
    static int pro(int n ){
       if(n == 0) {
           return 1;
       }
       return (n%10) * pro(n/10);
    }
}
