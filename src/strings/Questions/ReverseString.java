package strings.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Arrays.toString(reverseStringMethodThree(s)));
    }
    public static String reverseStringMethodOne(String s) {
        String ans = "";
        for(int i =0 ; i < s.length(); i++){
            ans = s.charAt(i) + ans;
        }
        return ans;
    }

    public static StringBuilder reverseStringMethodTwo(String s) {
        StringBuilder ans = new StringBuilder(s);
        int n = s.length();
        for(int i =0 ; i < n/2; i++){
           char first = s.charAt(i);
           char second = s.charAt(n-1-i);
           ans.setCharAt(i , second);
           ans.setCharAt(n-1-i, first);
        }
        return ans;
    }


    public static char[] reverseStringMethodThree(String s) {
        int n = s.length();
        char[] ans = s.toCharArray();

        for(int i =0 ; i < n/2; i++){
            char first = ans[i];
            char second = ans[n-1-i];
            ans[i] = second;
            ans[n-1-i] = first;
        }
        return ans;
    }
}
