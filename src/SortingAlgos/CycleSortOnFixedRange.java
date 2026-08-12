package SortingAlgos;

import java.util.Arrays;

public class CycleSortOnFixedRange {
    public static void main(String[] args) {
        int[] arr = {1, -4, 3, 2,9, 5, 10};
        System.out.println(Arrays.toString(cycleSortOnRange(arr,5)));
    }
    public static int[] cycleSortOnRange(int[] arr, int N) {
        int i =0;
        int n = arr.length;
        while(i<n){
            int expectedIndex = arr[i]-1;
            if(expectedIndex<0 ||expectedIndex>=n || arr[i]==arr[expectedIndex]){
                i++;
            }else{
                swap(arr, expectedIndex, i);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
