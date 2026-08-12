package SortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,19, 25,23,123, 5,53,43, 2323,27 };
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int passes = n - 2;
        for (int i = 0; i <= passes; i++) {
            boolean isSwapped = false;
            for (int j = 0; j <= passes-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                    isSwapped = true;
                }

            }
            if (!isSwapped) {return arr;}
        }
        return arr;
    }

    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
