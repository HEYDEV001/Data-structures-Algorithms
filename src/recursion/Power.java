package recursion;

public class Power {
    public static void main(String[] args) {
//        System.out.println(power(100000, 2));
        System.out.println(powerOptimised(20, 2));

    }
    public static int power(int n, int x) {
        if(n == 0) return 1;
        return x * power(n - 1, x);
    }

    public static int powerOptimised(int n, int x) {
        if(n == 0) return 1;
        int half = powerOptimised(n / 2, x);
        if((n & 1) == 0){
            return half * half;
        }else {
            return x *  half * half;
        }
    }
}
