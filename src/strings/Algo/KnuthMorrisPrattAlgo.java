package strings.Algo;

public class KnuthMorrisPrattAlgo {
    public static void main(String[] args) {

    }
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        char[] pattern = needle.toCharArray();
        int[] lps = buildLPS(pattern);
        int i =0 ;
        int j =0 ;
        while(i < n ){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
                if(j == m){
                    return (i-m);
                }
            }else{
                if(j==0) i++;
                else j = lps[j-1];
            }
        }
        return -1;
    }
    private int[] buildLPS (char[] pattern){
        int m = pattern.length;
        int i= 1;
        int len = 0;
        int[] lps = new int[m];
        while(i < m){
            if(pattern[i] == pattern[len]){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len==0) i++;
                else len = lps[len-1];
            }
        }
        return lps;
    }
}
