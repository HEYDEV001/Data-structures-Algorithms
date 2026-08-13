package bitManipulation.ShashCode.LeetCode;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
    }
//    public static int[] countBits(int n) {
//        int[] arr = new int[n+1];
//        for(int i = 0 ; i <= n;i++){
//            int index =i;
//            int currNum = i;
//            while (currNum > 0) {
//                if ((currNum & 1) != 0) {
//                    arr[index]++;
//                }
//                currNum = currNum>>1;
//            }
//        }
//        return arr;
//
//    }

    public static int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i = 0 ; i <= n;i++){
            arr[i] = arr[i>>1] + (i&1);
        }
        return arr;

    }
}
