package mathsForDSA.part_2;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(11));

    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        int i = 1;
        int count = 0;
        while (i <=Math.sqrt(num)) {
            if(num % i == 0) {
                count++;
            }
            i++;
        }
        return count < 3;
    }
}
