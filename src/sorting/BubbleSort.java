package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        bubbleSort(arr);
        optimisedBubbleSort(arr2);

    }
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length -1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The Sorted Array is: "+ Arrays.toString(arr));
    }
    public static void optimisedBubbleSort(int[] arr) {
        for(int turn = 0 ; turn < arr.length -1 ;turn ++){
            int swapCount = 0;
            for(int el = 0 ; el<arr.length-1-turn ; el++){
                if(arr[el]>arr[el+1]){
                    int temp =  arr[el];
                    arr[el] = arr[el+1];
                    arr[el+1] = temp;
                    swapCount++;
                }
            }
            if(swapCount == 0){
                System.out.println("The Array is already sorted : "+ Arrays.toString(arr));
                return;
            }
        }

        System.out.println("The sorted array is : "+ Arrays.toString(arr));
    }
}
