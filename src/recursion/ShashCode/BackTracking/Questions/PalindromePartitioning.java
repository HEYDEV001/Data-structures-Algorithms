package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {

    }
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> current = new ArrayList<>();
        allPalindromes(0, res, current, s);
        return res;
    }
    private static void allPalindromes(int index , List<List<String>> res,List<String> current, String s ){
        int n  = s.length();
        if(index==n){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int end = index; end<n;end++){
            if(isPalindrome(s,index, end)){
                current.add(s.substring(index,end+1));
                allPalindromes(end+1, res, current, s);
                current.removeLast();
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!= s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
