package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {

    }
    public static List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> result  = new ArrayList<>();
        backTrack(digits, 0, "", result, map);
        return result;
    }
    public static void backTrack(String digits, int index, String current, List<String> result, HashMap<Character, String> map){
        if(index == digits.length()){
            result.add(current);
            return;
        }
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        for(int i =0; i< letters.length(); i++){
            current = current + letters.charAt(i);
            backTrack(digits, index +1,  current,result,map);
            current = current.substring(0, current.length()-1);
            // Either the above three lines or this bottom line
            // backTrack(digits, index +1,  current + letters.charAt(i),result,map);
            // because we are not adding anything into the current string we are just passing it to the next recursion call with a value so oit doesn't need to delete it after completing the call
        }

    }
}
