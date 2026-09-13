package recursion.ShashCode.Questions.StringQuestions.SubSequence;

public class PrintSelectiveSubSequence {
    public static void main(String[] args) {
        printSelectiveSubSequence("abc", 0, "");
    }
    public static void printSelectiveSubSequence(String string, int index, String curr) {
        if (index == string.length()) {
            if(curr.startsWith("a")){
                System.out.print(curr + " ");
            }
            return;
        }
        // Pick
        printSelectiveSubSequence(string, index + 1, curr + string.charAt(index));
        // No-pick
        printSelectiveSubSequence(string, index + 1, curr);
    }
}
