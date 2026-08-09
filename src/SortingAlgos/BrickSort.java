package SortingAlgos;

import java.util.Arrays;

public class BrickSort {
    public static void main(String[] args) {
        int[] arr = {2,23, 14,455 ,9, 7, 8};
        System.out.println(Arrays.toString(brickSort(arr)));
    }
    public static int[] brickSort(int[] arr){
        int n = arr.length;
        int passes = n - 2;
        boolean isSorted = false;
        while(!isSorted){
            boolean isSwapped = false;
            for(int i = 0; i <= passes; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    isSwapped = true;
                }
            }
            for(int i = 1; i <= passes; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                isSorted = true;
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
