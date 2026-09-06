package SlidingWindow.Questions;

import java.util.Arrays;

public class CountOccurencesOfAnagrams {
    public static void main(String[] args) {
        String txt = "forxxorfxdofr", pat = "for";
        System.out.println(search(pat, txt));
    }
    public static int search(String pat, String txt) {
        int k = pat.length();
        int n = txt.length();
        int[] patMap = new int[26];
        for(int i = 0; i <k; i++){
            int index = pat.charAt(i)-'a';
            patMap[index]++;
        }
        int[] txtMap = new int[26];
        for(int i = 0; i <k; i++){
            int index = txt.charAt(i)-'a';
            txtMap[index]++;
        }
        int count = 0;
        if(Arrays.equals(txtMap, patMap)){
            count ++;
        }
        for(int i = 1; i < n-k+1; i++){
            int toBeInsertedIndex = txt.charAt(i+k-1)-'a';
            int toBeRemovedIndex = txt.charAt(i-1)-'a';
            txtMap[toBeInsertedIndex]++;
            txtMap[toBeRemovedIndex]--;
            if(Arrays.equals(txtMap, patMap)){
                count ++;
            }
        }
        return count;
    }
}
