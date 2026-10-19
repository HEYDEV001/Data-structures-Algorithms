package strings.Questions;

import java.util.HashMap;

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
}
