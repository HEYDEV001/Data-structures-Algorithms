package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {

    }
    public static List<String> generateParenthesis(int n) {
        List<String> result  = new ArrayList<>();
        backTrack(result, n , 0 , 0 ,new StringBuilder(""));
        return result;
    }
    public static void backTrack(List<String> result , int n , int open, int close, StringBuilder current){
        if(open == n && close == n){
            result.add(current.toString());
            return;
        }
        if(open<n){
            current.append('(');
            backTrack(result , n , open+1, close, current);
            current.deleteCharAt(current.length()-1);
        }
        if(close<n && close < open){
            current.append(')');
            backTrack(result , n , open, close+1, current);
            current.deleteCharAt(current.length()-1);
        }
    }
}
