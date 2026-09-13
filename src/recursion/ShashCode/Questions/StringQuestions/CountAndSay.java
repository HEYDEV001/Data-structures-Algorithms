package recursion.ShashCode.Questions.StringQuestions;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));

    }
    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String res = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int index =0;
        int count =0;
        while(index < res.length()){
            count++;
            if(index == res.length()-1 || res.charAt(index) != res.charAt(index+1)){
                sb.append(count).append(res.charAt(index));
                count =0;
            }
            index++;
        }
        return sb.toString();

    }
}
