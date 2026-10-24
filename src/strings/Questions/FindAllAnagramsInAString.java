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
        // Initial window pre computation
        for(int i =0 ; i < m ; i++){
            char pCh = p.charAt(i);
            char sCh = s.charAt(i);
            pCount[pCh-'a']++;
            sCount[sCh-'a']++;
        }

        if(Arrays.equals(sCount, pCount)){
            list.add(0);
        }
        // Sliding the window across the s string tile the n-m-1 th index
        for( int i =1; i < n-m +1; i++){
            // calculating the previous index that is needed to be removed and the next index that will be included in the window
            int prev = s.charAt(i-1) - 'a';
            int next = s.charAt(i+m-1) -'a';
            // decreasing the count at the removal index;
            sCount[prev]--;
            // Increasing the count at the new index in the window
            sCount[next]++;
            // checking if the counts on the same indexes are same in the both the arrays
            if(Arrays.equals(sCount, pCount)){
                list.add(i);
            }
        }
        return list;

    }
}
