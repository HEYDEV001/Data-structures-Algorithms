package SlidingWindow.Questions;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));

    }
    public static String minWindow(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i< t.length(); i++){
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int ucc = map.size();
        int startIndex =-1;
        int windowStart =0;
        int windowEnd =0;
        int minLength = Integer.MAX_VALUE;
        int n = s.length();
        while(windowEnd < n){
            //Expansion Phase
            char ch = s.charAt(windowEnd);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0){
                    ucc--;
                }
            }
            //Shrinking Phase
            while(ucc == 0){
                int len = windowEnd - windowStart +1;
                if(len < minLength){
                    minLength = len;
                    startIndex = windowStart;
                }
                ch = s.charAt(windowStart);
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch) + 1);
                    if(map.get(ch) > 0){
                        ucc++;
                    }
                }
                windowStart++;
            }
            windowEnd++;
        }
        return (startIndex == -1) ? "" : s.substring(startIndex, startIndex + minLength);
    }
}

