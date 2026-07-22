package bitManipulation.ShashCode.LeetCode;

public class MinimumBitFlips {
    public static void main(String[] args) {
        System.out.println(minBitFlips(10,8));

    }
    public static int minBitFlips(int start, int goal) {
        int resultingNumber = start ^ goal;
        int count = 0;
        while(resultingNumber > 0){
            if((resultingNumber & 1) !=0 ){
                count++;
            }
            resultingNumber = resultingNumber >> 1;
        }
        return count;
    }
}
