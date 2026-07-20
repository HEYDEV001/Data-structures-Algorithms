package bitManipulation.ShashCode;

public class BrianKernighanAlgo {
    public static void main(String[] args) {
        System.out.println(countSetBits(10));

    }
    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            n &= n - 1;
            count++;
        }
        return count;
    }
}
