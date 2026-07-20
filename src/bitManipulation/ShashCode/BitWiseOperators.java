package bitManipulation.ShashCode;

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

       here if NOT of a number is -ve then we will calculate its 2's complement
       but if it is +ve then we stop right there

       for ex:
       7 -> 0 0 1 1 1 (In binary)
       ~7 -> 1 1 0 0 0 (Here MSB is set then ~7 is -ve)
       now we have to find the 2's complement of (1 1 0 0 0)
       that will be : 1's complement (Flip Bits) : 1 1 0 0 0 -> 0 0 1 1 1
       2's complement (Add 1 to the 1's complement result) : 0 0 1 1 1
                                                            +        1
                                                             0 1 0 0 0 = 8(In decimal)
       So ~7 = -8

       and if we have to find the NOT of a -ve number
       then we will first find the 2's complement of the -ve number
       then we will calculate the NOT of the 2's complement result of that -ve number
       NOT will be calculated same as above


       TODO: TRICK: ~N = -(N+1)
       this above trick works for every number(+ve or -ve)
         */
        System.out.println(~(-7));

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
