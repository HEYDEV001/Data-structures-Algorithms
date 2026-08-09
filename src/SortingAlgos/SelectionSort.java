package SortingAlgos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        /*
        TC = O(n^2)
         */
        int [] arr  = {2, 34,5 ,3, 12,1 ,435 ,6 ,87};
        System.out.println(Arrays.toString(biDirectionalSelectionSort(arr)));
    }
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int minElement = arr[i];
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<minElement){
                    minElement = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        return arr;
    }
    public static int[] biDirectionalSelectionSort(int[] arr){
        int n = arr.length;
        int k  = n-1;
        for(int i =0;i<k;i++){
            int minElement = arr[i];
            int minIndex = i;
            int maxElement = arr[i];
            int maxIndex = i;
            for(int j = i+1;j<=k;j++){
                if(arr[j]<minElement){
                    minElement = arr[j];
                    minIndex = j;
                }else if(arr[j]>maxElement){
                    maxElement = arr[j];
                    maxIndex = j;
                }
            }
            swap(arr, i, minIndex);
            if(maxElement == arr[minIndex]){
                swap(arr, k, minIndex);
            }else {
                swap(arr, k, maxIndex);
            }
        }
        return arr;
    }


    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
