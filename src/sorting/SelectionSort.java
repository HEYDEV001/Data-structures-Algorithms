package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        selectionSort(arr);


    }
    public static void selectionSort(int[] arr) {

        for(int turn = 0; turn < arr.length-1; turn++) {
            // Consider the minimum element is at the first index of unsorted array
            int minimumPosition = turn;
            for(int index = turn+1; index < arr.length; index++) {
                // Update the minimumPosition if smaller element id found
                if(arr[minimumPosition] > arr[index]) {
                    minimumPosition = index;
                }

            }
            // This will swap the smallest element to the most froward index available (which is equal to the turn )
            int temp = arr[minimumPosition];
            arr[minimumPosition] = arr[turn];
            arr[turn] = temp;

        }
        System.out.println("the sorted array is :" + Arrays.toString(arr));
    }
}
