package strings.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {

    }

    public List<Integer> findAnagrams(String s, String p) {
        int n  = s.length();
        int m  = p.length();
        List<Integer> list = new ArrayList<>();
        if(m>n) return list;
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for(int i =0 ; i < m ; i++){
            char pCh = p.charAt(i);
            char sCh = s.charAt(i);
            pCount[pCh-'a']++;
            sCount[sCh-'a']++;
        }

        if(Arrays.equals(sCount, pCount)){
            list.add(0);
        }
        for( int i =1; i < n-m +1; i++){
            int prev = s.charAt(i-1) - 'a';
            int next = s.charAt(i+m-1) -'a';
            sCount[prev]--;
            sCount[next]++;
            if(Arrays.equals(sCount, pCount)){
                list.add(i);
            }

        }
        return list;

    }
}
