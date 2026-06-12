package bitManipulation;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {

        getIthBit(15,3);
        System.out.println(setIthBit(10, 0));
        System.out.println(clearIthBit(10, 1));


    }
    // Get ith bit of a number
    public static void getIthBit(int number, int i ){
        // This is the formula for getting the ith bit :
        // number & (1<<i)
        // if the above formula gives us value other than zero then the bit is 1 otherwise it is 0
        int bitMask = 1 << i;
        if( (number & bitMask) != 0 ){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

    // Set ith Bit
    public static int  setIthBit(int number, int i ){
        // here it will set the ith bit because when we do
        /*
        1 << i -> This will set the bit at ith position
        and if we perform | (OR) of 1<<i with the number it will set the ith bit only and will not affect other bits
        number | (1 << i) -> will set the ith bit of the number and will not affect other bits
         */
        int bitMask = 1 << i;
        return number | bitMask;

    }

    // Clear ith Bit
    public static int clearIthBit(int number, int i ){
        // here it will Clear the ith bit because when we do
        /*
        ~(1 << i) -> This will clear the bit at ith position and will set all  other bits except the ith bit.
        and if we perform & (AND) of ~(1<<i) with the number it will clear the ith bit only and will not affect other bits
        number & ~(1 << i) -> will clear the ith bit of the number and will not affect other bits
         */
        int bitMask = ~(1<<i);
        return number & bitMask;
    }


}
