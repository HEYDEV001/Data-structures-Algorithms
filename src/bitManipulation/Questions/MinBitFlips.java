package bitManipulation.Questions;

public class MinBitFlips {
    public static void main(String[] args) {
        System.out.println(minBitFlips(10 , 12));

    }
    public static int minBitFlips(int start, int goal) {
        int temp  = start ^ goal;
        int count = 0;
        while(temp > 0){
            if((temp & 1 )!= 0){
                count++;
            }
            temp >>= 1;
        }
        return count;

    }
}
