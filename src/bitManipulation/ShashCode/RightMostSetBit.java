package bitManipulation.ShashCode;

public class RightMostSetBit {
    public static void main(String[] args) {
        System.out.println(numberFormedByRightMostSetBit(20));

    }
    public static int numberFormedByRightMostSetBit(int n) {
        return n & -n;
        // here we did n & -n because -n consist of only one set bit at rightmost bit of its =ve number
        // for ex n = 12 => 1100 and 2's complement of 12 is 0100 => -12
    }
}
