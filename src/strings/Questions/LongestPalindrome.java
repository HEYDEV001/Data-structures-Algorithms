package strings.Questions;

import java.util.HashMap;
import java.util.HashSet;

public class LongestPalindrome {
    public static void main(String[] args) {

    }
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map  = new HashMap<>();
        int result=0;
        int oddCount =0;
        for(int i = 0 ; i < s.length(); i++){
            char key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0) +1);
            if(map.get(key) % 2 !=0){
                oddCount++;
            }else{
                oddCount--;
                result +=2;
            }
        }
        return (oddCount>0) ? result +1 : result;
    }


    public int longestPalindrome2(String s) {
        HashSet<Character> set  = new HashSet<>();
        int result=0;
        for(int i = 0 ; i < s.length(); i++){
            char key = s.charAt(i);
            if(set.contains(key)){
                result +=2;
                set.remove(key);
            }else{
                set.add(key);
            }
        }
        return (!set.isEmpty()) ? result +1 : result;
    }


    public int longestPalindrome3(String s) {
        int[] set = new int[128];
        int result=0;
        int oddCount =0;
        for(char ch : s.toCharArray()){
            if(set[ch] != 0){
                result +=2;
                set[ch] =0;
                oddCount--;
            }else{
                set[ch] = 1;
                oddCount++;
            }
        }
        return (oddCount > 0) ? result +1 : result;
    }
}
