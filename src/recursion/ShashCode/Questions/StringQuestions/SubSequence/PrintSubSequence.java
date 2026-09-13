package recursion.ShashCode.Questions.StringQuestions.SubSequence;

public class PrintSubSequence {
    public static void main(String[] args) {
        printSubSequence("abc", 0, " ");

    }
    public static void printSubSequence(String s, int index, String curr) {
        if (index == s.length()) {
            System.out.print(curr + " ");
            return;
        }
        printSubSequence(s, index + 1, curr + s.charAt(index));
        printSubSequence(s, index + 1, curr);
    }
}
