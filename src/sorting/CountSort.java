package sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        countSort(arr);

    }

    public static void countSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int[] counts = new int[largest + 1];

        //Filling the counts Array
        for (int index = 0; index < arr.length; index++) {
            counts[arr[index]]++;
        }

        //Arranging the Sorted elements into the original array
        int originalIndex = 0;
        for (int j = 0; j < counts.length; j++) {
            while (counts[j] > 0) {
                arr[originalIndex] = j;
                originalIndex++;
                counts[j]--;
            }
        }
        System.out.println("The sorted Array is : " + Arrays.toString(arr));
    }
}
