package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(compressString(s));


        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(chars.length);
        System.out.println(compress(chars));


    }

    public static String compressString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(str.charAt(i));
            if (count > 1) {
                result.append(count);
            }
        }
        return result.toString();
    }

    public static int compress(char[] chars) {
        if(chars.length ==0 ) return 0;
        if(chars.length ==1) return 1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            Integer count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            result.append(chars[i]);
            result.append(count);
        }
        String compressedString = result.toString();
        chars = compressedString.toCharArray();
        System.out.println(Arrays.toString(chars));
        return chars.length;


    }
}
