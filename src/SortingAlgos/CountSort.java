package SortingAlgos;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int [] arr  = {2, 34,5 ,3, 12,1 ,435 ,6 ,87};
        System.out.println(Arrays.toString(countSort(arr)));
    }
    public static int[] countSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int a : arr){
            max = Math.max(max,a);
        }
        int[] count = new int[max+1];
        for(int a : arr){
            count[a]++;
        }
        for(int i = 1; i <= max; i++){
            count[i] += count[i-1];
        }
       int n = arr.length;
        int[] res = new int[n];
        for ( int i  = n-1; i >= 0; i--){
            int val = arr[i];
            int prefixSum  = count[val];
            res[prefixSum-1] = val;
            count[val]--;
        }
        return res;
    }
}
