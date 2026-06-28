package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        Quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /*yha pivot element middle bala liya h or check kara h ki pivot ke left bale sare element pivot se chote hone chaiye
    or right bale sare bade hone chaiye
    or ager chota h to start bale pointer ko aage badhate jana h or end bale ko kam karte jana h
     */
    static void Quick(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < arr[pivot]) {
                start++;
            }
            while (arr[end] > arr[pivot]) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        Quick(arr, low, end);
        Quick(arr, start, high);
    }
}
