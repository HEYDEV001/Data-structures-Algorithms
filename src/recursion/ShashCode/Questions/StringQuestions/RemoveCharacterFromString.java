package recursion.ShashCode.Questions.StringQuestions;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String s = "naman";
        StringBuilder res = new StringBuilder();
        System.out.println(removeCharacterFromString(s, 'a', 0, res));

    }
    public static String removeCharacterFromString(String s, char ch , int index, StringBuilder res) {
        if(index == s.length()) {
            return res.toString();
        }
        if(s.charAt(index) != ch) {
            res.append(s.charAt(index));
            return removeCharacterFromString(s, ch, index + 1, res);
        }else{
            return removeCharacterFromString(s, ch, index + 1, res);
        }
    }
}
