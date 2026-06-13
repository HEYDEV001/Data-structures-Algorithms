package bitManipulation;

public class FastExpo {
    public static void main(String[] args) {
        System.out.println(expo(9, 10));

    }
    public static int expo(int a, int n ) {
        int ans = 1;
        while (n > 0) {
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a*a;
            n = n >> 1; // n>>=1    Both are same.
        }
        return ans;
    }
}
