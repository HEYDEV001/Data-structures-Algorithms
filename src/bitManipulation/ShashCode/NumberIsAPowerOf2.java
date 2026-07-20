package bitManipulation.ShashCode;

public class NumberIsAPowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(16));

    }
    public static boolean isPowerOf2(int n) {
        return (n & (n - 1)) == 0;
    }
}
