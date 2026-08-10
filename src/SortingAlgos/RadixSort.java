package SortingAlgos;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int [] arr  = {2, 34,5 ,3, 12,1 ,435 ,6 ,87};
        System.out.println(Arrays.toString(radixSort(arr)));
    }
    public static int[] radixSort(int[] arr){
        int maxElement = Integer.MIN_VALUE;
        for(int a : arr){
            maxElement = Math.max(maxElement, a);
        }
        int digits =  (maxElement==0)?1:(int) Math.log10(maxElement)+1;

         for(int d =0; d<digits; d++){
             int[] count = new int[10];
             for(int a : arr){
                 int digit = (a/(int)Math.pow(10,d)) % 10;
                 count[digit]++;
             }
             for(int i =1; i<10; i++){
                 count[i] += count[i-1];
             }
             int n = arr.length;
             int[] result = new int[n];
             for(int i = n-1; i>=0; i--){
                 int digit = (arr[i]/(int)Math.pow(10,d)) % 10;
                 int freq = count[digit];
                 result[freq-1] = arr[i];
                 count[digit]--;
             }
             arr = result;
         }


        return arr;
    }
}
