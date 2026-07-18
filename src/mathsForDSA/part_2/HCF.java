package mathsForDSA.part_2;

public class HCF {
    public static void main(String[] args) {
        System.out.println( hcf(0,0));
    }
    public static int hcf(int a, int b) {
        int minOfTwo = Math.min(a, b);
        if (minOfTwo == 0) return Math.max(a,b);
        int hcf = 1;
        for(int i = 1; i <= minOfTwo; i++) {
            if(a % i == 0 && b % i == 0) {
                hcf = Math.max(hcf, i);
            }
        }
        return hcf;
    }
}
