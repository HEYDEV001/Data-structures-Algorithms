package strings;

import java.util.Scanner;

public class ToUpperCaseEveryWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String s = sc.nextLine();
        System.out.println(toUpperCase(s));


    }
    public static String toUpperCase(String sentence) {
        StringBuilder result = new StringBuilder();
        char ch = Character.toUpperCase(sentence.charAt(0));
        result.append(ch);
        for (int i =1 ; i < sentence.length(); i++) {
            if(sentence.charAt(i-1) == ' '){
                result.append(Character.toUpperCase(sentence.charAt(i)));
            }else{
                result.append(sentence.charAt(i));
            }

        }
        return result.toString();
    }
}
