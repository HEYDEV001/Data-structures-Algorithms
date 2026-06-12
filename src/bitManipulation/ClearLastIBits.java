package bitManipulation;

public class ClearLastIBits {
    public static void main(String[] args) {
        System.out.println(clearLastIBits(15,2));

    }
    public static int clearLastIBits(int num , int i ) {
        /* here 0 in binary is written as -> 00000000
        ~0 will be -> 11111111
        ~0 << 2 will become -> 11111100
        if we perform & of the above bit mask with our Number it will clear the last i bits.
         */
        int bitMask = ~(0) << i;
        return num & bitMask;
    }
}
