package mathsForDSA.part_2;

import java.util.Arrays;

public class SieveAlgo {
    public static void main(String[] args) {
        printPrimes(30);

    }
    public static void printPrimes(int n) {
        boolean[] arr =new boolean[n+1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(arr[i]){
                System.out.print(i+" ");
            }
        }
    }
}
