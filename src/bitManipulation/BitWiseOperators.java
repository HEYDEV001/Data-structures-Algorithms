package bitManipulation;

public class BitWiseOperators {
    public static void main(String[] args) {
        // bitwise AND -> &
        /*
        0, 0 -> 0
        0, 1 -> 0
        1, 0 -> 0
        1, 1 -> 1
         */
        System.out.println(5 & 6);
        // bitwise OR -> |
        /*
        0, 0 -> 0
        0, 1 -> 1
        1, 0 -> 1
        1, 1 -> 1
         */
        System.out.println(5 | 6);
        // bitwise XOR -> ^
        /*
        0, 0 -> 0
        0, 1 -> 0
        1, 0 -> 0
        1, 1 -> 0
         */
        System.out.println(5 ^ 6);
        // bitwise One's Complement (NOT)  -> ~   (works only for single element)
        /*
       ~0 -> 1
       ~1 -> 0
         */
        System.out.println(~5);

        // Binary leftShift -> a<<b
        /*
        here a's binary will be leftShifted by b places
        Ex : a = 00001010 , b=2
        then result = 00101000
        the whole binary will be shifted to left by 2 places and the last remaining places will be filled with 0's
        the resulting value will be derived by the formula :
        a << b = a * 2^b
         */
        System.out.println(5 << 2);

        // Binary rightShift -> a>>b
        /*
        here a's binary will be rightShifted by b places
        Ex : a = 00001010 , b=
        then result = 00000101
        the whole binary will be shifted to right by 2 places and the last remaining places will be filled with 0's
        the resulting value will be derived by the formula :
        a >> b = a / 2^b
         */
        System.out.println(6>>1);
    }
}
