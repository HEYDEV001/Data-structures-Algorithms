package Stack.Questions;

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {

    }
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int open = 0;
        int close =0;
        for(int i  = 0 ; i < n ; i++){
            char ch  = s.charAt(i);
            if(ch== '('){
                open++;
            }else{
                if(open > 0){
                    open--;
                }else{
                    close++;
                }
            }
        }
        return open + close;
    }
}
