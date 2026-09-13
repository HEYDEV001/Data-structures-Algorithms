package recursion.ShashCode.Questions.StringQuestions;

public class ReplacePI {
    public static void main(String[] args) {
        String str = "XPIXPIXPI";
       StringBuilder res = new StringBuilder();
        System.out.println(replacePI(str, 0, res));
    }
    public static String replacePI(String str, int index, StringBuilder res) {
        if (index == str.length()) {
            return res.toString();
        }else if(index < str.length()-1 && str.charAt(index) == 'P' && str.charAt(index+1) == 'I'){
            res.append("3.14");
            return replacePI(str, index+2, res);
        }else{
            res.append(str.charAt(index));
            return replacePI(str, index+1, res);
        }
    }
}
