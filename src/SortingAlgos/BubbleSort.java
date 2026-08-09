package SortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3, 4,5 ,6, 7, 8};
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
            System.out.println("hello");
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
