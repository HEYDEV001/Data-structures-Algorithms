package TwoPointers;

public class SeparateBlackAndWhiteBalls {
    public static void main(String[] args) {

    }
    public static long minimumSteps(String s) {
        int l = 0 ;
        int i =0;
        long minimunNumberOfSteps =0;
        while(i < s.length()){
            if(s.charAt(i) =='0'){
                minimunNumberOfSteps += (i -l);
                l++;
            }
            i++;
        }
        return minimunNumberOfSteps;

    }
}
