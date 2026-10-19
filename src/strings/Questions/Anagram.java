package strings.Questions;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {

    }

    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0 ; i < s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0) + 1);
        }
        return map1.equals(map2);

    }

    public static boolean areAnagrams2(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        int[] characters = new int[26];
        int len = s1.length();
        int i  = 0;
        while(i < s1.length()){
            char c1 = s1.charAt(i);
            int indexOfC1 = c1-97;
            characters[indexOfC1]++;

            char c2 = s2.charAt(i);
            int indexOfC2 = c2-97;
            characters[indexOfC2]++;
            i++;
        }

        for(i = 0 ; i < 26 ; i++){
            if(characters[i] != 0){
                return false;
            }
        }
        return true;

    }


    public static boolean areAnagrams3(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        int[] characters = new int[26];
        int i  = 0;
        while(i < s1.length()){
            characters[s1.charAt(i)-'a']++;
            characters[s2.charAt(i)-'a']--;
            i++;
        }
        for(i = 0 ; i < 26 ; i++){
            if(characters[i] != 0){
                return false;
            }
        }
        return true;

    }

}
