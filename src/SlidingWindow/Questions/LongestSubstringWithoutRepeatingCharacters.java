package SlidingWindow.Questions;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }
    public static int lengthOfLongestSubstring(String s) {

        int windowStart =0;
        int windowEnd =0;
        int n = s.length();
        HashSet<Character> set  = new HashSet<>();
        int length =0;
        int maxLength =Integer.MIN_VALUE;
        while(windowEnd<n){
            char ch = s.charAt(windowEnd);
            if(set.contains(ch)){
                while(windowStart < windowEnd && set.contains(ch)){
                    set.remove(s.charAt(windowStart));
                    windowStart++;
                }
            }
            set.add(ch);
            length = windowEnd-windowStart+1;
            maxLength = Math.max(maxLength,length);
            windowEnd++;
        }
        return (maxLength == Integer.MIN_VALUE) ? 0 : maxLength;
    }

    // Approach 2 -> using hashMap
    public int lengthOfLongestSubstring2(String s) {
        int windowStart =0;
        int windowEnd =0;
        int n = s.length();
        HashMap<Character, Integer> map  = new HashMap<>();
        int maxLength =Integer.MIN_VALUE;
        while(windowEnd<n){
            char ch = s.charAt(windowEnd);
            if(map.containsKey(ch) && (map.get(ch)+1)>windowStart){
                windowStart = map.get(ch) + 1;
            }
            map.put(ch, windowEnd);
            maxLength = Math.max(maxLength,windowEnd-windowStart+1);
            windowEnd++;
        }
        return (maxLength == Integer.MIN_VALUE) ? 0 : maxLength;
    }
}
