package strings.Questions;

public class KAnagrams {
    public static void main(String[] args) {

    }
    public boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        int n = s1.length();
        int m = s2.length();
        if(n != m) return false;

        int[] nums1 = new int[26];
        int[] nums2 = new int[26];

        for(int i=0 ; i < n ; i++ ){
            nums1[s1.charAt(i) - 'a']++;
            nums2[s2.charAt(i) - 'a']++;
        }
        int count  = 0;
        for(int j = 0 ; j < 26; j++){
            if(nums1[j] > nums2[j]){
                count += nums1[j] - nums2[j];
            }
        }
        return (count <= k);
    }
}
