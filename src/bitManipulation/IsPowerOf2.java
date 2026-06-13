package bitManipulation;

public class IsPowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(8));


    }
    public static boolean isPowerOf2(int n) {
        // if a number is power of 2
        /*
        then number & (number-1) => 0
        This is the condition to check whether number is power of 2 or not.
         */
        return (n & (n - 1)) == 0;
    }
}
