package recursion.ShashCode;

public class DigitsInFactorial {
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(7));
    }
    // This works upto 12
    public static int digitsInFactorial(int n) {
        int factorial = factorial(n);
        int count =0;
        while(factorial>0){
            count++;
            factorial = factorial/10;
        }
        return count;
    }
    public static int factorial (int n) {
        if(n == 0 || n == 1) return 1;
        return factorial(n - 1) * n;
    }
}
