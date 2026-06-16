package recursion;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        System.out.print(sumOfNPrimes(10));

    }
    public static int sumOfNPrimes(int n) {
        if(n == 1) return 1;
        return n + sumOfNPrimes(n-1);
    }
}
