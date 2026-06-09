package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        insertionSort(arr);

    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            // This is the first element of the unsorted array
            int curr = arr[i];
            // this is the last element of the Sorted Array
            int prev = i - 1;
            // This checks that the curr(first element of the unsorted array) is less than the last element of the sorted array
            while (prev >= 0 && curr < arr[prev]) {
                // if the above  condition is true
                // Then the last element of the sorted array comes on the position of curr
                arr[prev + 1] = arr[prev];
                // this sets the previous element of the sorted array as the last element of SA
                prev--;
            }
            // This sets the element at the correct position.
            arr[prev + 1] = curr;
        }
        System.out.println("The sorted array is: "+ Arrays.toString(arr));
    }
}
