package SlidingWindow.Questions;

public class LongestSubStringWithKUniques {
    public static void main(String[] args) {
        String s =  "aabacbebebe";
        System.out.println(longestKSubstr(s,3));
    }
    public static int longestKSubstr(String s, int k) {
        int n = s.length();
        int[] frequencyMap = new int[26];
        int windowStart = 0;
        int windowEnd = 0;
        int maxLength =Integer.MIN_VALUE;
        int currLength =0;
        int uniqueCharacterCount =0;
        while(windowEnd < n){
            int index = s.charAt(windowEnd)-'a';
            if(frequencyMap[index] ==0){
                uniqueCharacterCount++;
            }
            frequencyMap[index]++;

            if(uniqueCharacterCount == k){
                currLength = windowEnd-windowStart+1;
                maxLength = Math.max(maxLength,currLength);
            }else if(uniqueCharacterCount > k){
                while(windowStart < windowEnd  && uniqueCharacterCount > k){
                    int index1 = s.charAt(windowStart)-'a';
                    windowStart++;
                    frequencyMap[index1]--;
                    if(frequencyMap[index1] == 0){
                        uniqueCharacterCount--;
                    }
                }
            }

            windowEnd++;

        }
        return (maxLength==Integer.MIN_VALUE) ? -1 :maxLength;
    }
}
