package DynamicProgramming.Questions.Medium.InfiniteInputPattern;

public class ShortestCommonSuperSequenceLength {
    public static void main(String[] args) {
        String str1 = "abca";
        String str2 = "cab";
        System.out.println(shortestCommonSuperSequence(str1, str2));

    }

    // Recursion
    public static int shortestCommonSuperSequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        return (n+m) - (lengthOfCommonSubSequence(str1, str2, n-1, m-1));
    }

    private  static int lengthOfCommonSubSequence(String text1, String text2, int i , int j){
        if(i< 0 || j< 0 ){
            return 0;
        }
        if(text1.charAt(i) == text2.charAt(j)){
            return 1 + lengthOfCommonSubSequence(text1, text2, i-1, j-1);
        }else{
            int case1 = lengthOfCommonSubSequence(text1, text2, i-1, j);
            int case2 = lengthOfCommonSubSequence(text1, text2, i, j-1);
            return Math.max(case1, case2);
        }

}
}
