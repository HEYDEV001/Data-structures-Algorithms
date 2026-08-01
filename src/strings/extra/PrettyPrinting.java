package strings.extra;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1234f;
       // System.out.printf("Formatted number is %.2f",a);//here 2 denotes that it will give decimal upto 2 digits
        /*
        it also round off the number,it is formatted so instead of "println" here it will be "printf"
         */
        System.out.printf("pie: %.4f",Math.PI);
        System.out.println();
        System.out.printf("hello my name is %s and my dog's name is %s","dev pathak","Rishi");
    }
}
/*
These are the placeholders
%c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline
 */