package strings.Questions;

import java.util.Arrays;
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



    public boolean isIsomorphic2(String s, String t) {
        int n = s.length();
        int[] stMap = new int[128];
        int[] tsMap = new int[128];
        Arrays.fill(stMap, -1);
        Arrays.fill(tsMap, -1);
        for(int i = 0 ; i < n; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(stMap[sChar] == -1){
                stMap[sChar] =(int) tChar;
            }
            if(tsMap[tChar] == -1){
                tsMap[tChar] =(int) sChar;
            }

            if(tsMap[tChar] != (int)sChar || stMap[sChar] != (int)tChar){
                return false;
            }
        }
        return true;

    }
}
