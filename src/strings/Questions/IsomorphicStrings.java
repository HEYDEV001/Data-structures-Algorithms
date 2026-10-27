package strings.Questions;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {

    }
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        HashMap<Character, Character> stMap = new HashMap<>();
        HashMap<Character, Character> tsMap = new HashMap<>();
        for(int i = 0 ; i < n; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!stMap.containsKey(sChar)){
                stMap.put(sChar, tChar);
            }
            if(!tsMap.containsKey(tChar)){
                tsMap.put(tChar, sChar);
            }
            if(tsMap.get(tChar) != sChar || stMap.get(sChar) != tChar){
                return false;
            }


        }
        return true;

    }
}
