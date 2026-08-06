package LinearSearch;

import org.ietf.jgss.GSSManager;

public class SmallestDivisibleDigits1 {
    public static void main(String[] args) {

        System.out.println(smallestNumber(11, 5));
    }

    public static int smallestNumber(int n, int t) {
        int product = getProduct(n);
        while (product % t != 0) {
            n++;
            product = getProduct(n);
        }
        return n;
    }

    public static int getProduct(int n) {
        int product = 1;
        int rem = 0;
        int original = n;
        while (original > 0) {
            rem = original % 10;
            product *= rem;
            original /= 10;
        }
        return product;
    }

}
