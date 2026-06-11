package strings;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Enter stating index for the subString: ");
        int statingIndex = sc.nextInt();
        System.out.println("Enter the endIndex for the subString: ");
        int endIndex = sc.nextInt();
        System.out.println(subStringMadeUp(s, statingIndex, endIndex));


    }
    public static String subStringMadeUp(String str , int start, int end ){
        String subString  = "";
        for(int i = start; i< end; i++){
            subString += str.charAt(i);
        }
        return subString;
    }
}
