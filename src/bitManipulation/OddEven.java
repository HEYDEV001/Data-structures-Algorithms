package bitManipulation;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(isEven(7));

    }
    public static Boolean isEven(int n) {
        int bitMask =1;
        if((n & bitMask) ==1){
            return false;
        }
        return true;
    }

    /*
    here we have performed n&1 which will always leave us with the Least significant bit (LSB)
    if LSB ==1 then the number is odd and vice-versa
    In n & 1
    1 is called bit mask.
     */
}
