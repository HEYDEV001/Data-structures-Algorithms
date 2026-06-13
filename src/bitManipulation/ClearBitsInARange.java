package bitManipulation;

public class ClearBitsInARange {
    public static void main(String[] args) {
        System.out.println(clearBitsInRange(28, 2, 3));

    }
    public static int clearBitsInRange(int num, int start, int end) {
        int a  = (1<< start )-1 ;
        int b  = ~0 << end+1;
        int bitMask = a | b;
        return num & bitMask;

    }
}
