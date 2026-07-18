package mathsForDSA.part_2;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        System.out.println(gcd(-12,-18));
        System.out.println(lcmByEuclideanTheorem(12,18));

    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int min = Math.min(a, b);
        if(min == 0) return Math.max(a, b);
        return gcd(b, a % b);
    }


    public static int lcmByEuclideanTheorem(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        return a*b / gcd(a, b);
    }
}
