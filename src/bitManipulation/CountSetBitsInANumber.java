package bitManipulation;

public class CountSetBitsInANumber {
    public static void main(String[] args) {
        System.out.println(countSetBits(16));

    }
    public static int countSetBits(int number) {
        // O(log(n))
        int count = 0;
        while (number < 0) {
            if ((number &1) != 0) {
                count++;
            }
            number = number>>1;
        }
        return count;
    }

    /*
    Note : if a number is to be represented in binary then the maximum number of bit required to represent that number is
    Log(n) + 1
    where the log is of base 2 and these are the maximum number of bits required to represent n in binary.
     */
}
