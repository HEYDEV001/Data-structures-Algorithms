package strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("", ""));


    }
    public static Boolean isAnagram(String one , String two ) {
        if(one.length() != two.length()) return false;
        if(one.length() == 0 && two.length()==0) return true;
        char[] oneArray = one.toCharArray();
        char[] twoArray = two.toCharArray();

        Arrays.sort(oneArray);
        Arrays.sort(twoArray);
        return Arrays.equals(oneArray, twoArray);
    }
}
