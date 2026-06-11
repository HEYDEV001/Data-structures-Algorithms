package strings;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class StringsCC {
    public static void main(String[] args) {



        // declaration + Initialization of character
        char ch = 'd';

        // declaration + Initialization of String
        String name = "Dev Pathak";
        // Here Object is Created
        String OriginalName   = new String("Dev Pathak");

        // String in JAVA are IMMUTABLE.

        //Input in STRINGS
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = input.nextLine(); // This will only take the first word
        System.out.println(string);
        System.out.println("Enter the String 2: ");
        String string2 = input.nextLine(); // This will take the whole sentence
        System.out.println(string2);

        // Length Function
        // In Arrays the length is a property, so we can write it like array.length
        // but in String the length is function, so we will write it like
        System.out.println(string2.length());

        // Concatenate the String
        String firstName  = "dev";
        String lastName  = "pathak";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Calling the function
        printLetters(fullName);


    }
    //Loops On Strings
    public static void printLetters(String str ){
        for(char ch : str.toCharArray()){
            System.out.print(ch+" ");
        }
    }
}
