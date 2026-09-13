package recursion.ShashCode.Questions.StringQuestions.SubSequence;

public class PrintSubSequence {
    public static void main(String[] args) {
        printSubSequence("abc", 0, "");

    }
    public static void printSubSequence(String s, int index, String curr) {
        if (index == s.length()) {
            System.out.print(curr + " ");
            return;
        }
        // Pick
        printSubSequence(s, index + 1, curr + s.charAt(index));
        // No-pick
        printSubSequence(s, index + 1, curr);
    }
}
