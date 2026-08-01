package strings.extra;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');// this will add according to the ASKII value
        System.out.println("a"+"b");//  This will concatenate the string , String will be concatenated
        System.out.println((char)('a'+3));
        System.out.println("a"+1);// this will be converted as string
        System.out.println("dev"+ new ArrayList<>());
        System.out.println('a'+1);
        /*
        the "+" will only work with primitives but there should be one String this is called Operator Overloading
         */
    }
}
