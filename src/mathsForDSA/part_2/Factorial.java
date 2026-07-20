package mathsForDSA.part_2;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(trailingZeroes(100));

    }
    public static double factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int trailingZeroes(int num) {
        int res =0;
        int i = 5;
        while(i<=num){
            res+= (num/i);
            i = i*5;
        }
        return res;
    }
}
