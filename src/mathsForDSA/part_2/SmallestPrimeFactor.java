package mathsForDSA.part_2;

import java.util.ArrayList;

public class SmallestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(smallestPrimeFactor(47));
        System.out.println(allSPF(30));

    }
    public static int smallestPrimeFactor(int n) {
        for(int i  = 2; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                return i;
            }
        }
        return n;
    }

    public static ArrayList<Integer> allSPF(int num) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] primes = new int[num+1];
        for(int i = 2; i <= num; i++) {
            primes[i] = i;
        }
        int squareRoot = (int) Math.sqrt(num);
        for(int i = 2; i <= squareRoot; i++) {
            if(primes[i] == i) {
                for(int j = i*i; j <= num; j+=i) {
                    if(primes[j] == j) {
                        primes[j] = i;
                    }
                }
            }
        }
        for(int i = 2; i <= num; i++) {
            res.add(primes[i]);
        }
        return res;
    }
}
