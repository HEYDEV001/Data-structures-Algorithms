package recursion.ShashCode.Questions.StringQuestions;

public class PrintString {
    public static void main(String[] args) {
        String string  = "STRING";
        printString(string, 0);
        reverseString(string, 0);

    }
    public static void printString(String str, int index) {
        if (index == str.length()) {
            return;
        }
        System.out.print(str.charAt(index) + " ");
        printString(str, index + 1);
    }

    public static void reverseString(String  str, int index) {
        if (index == str.length()) {
            return;
        }
        reverseString(str, index + 1);
        System.out.print(str.charAt(index) + " ");
    }
}
