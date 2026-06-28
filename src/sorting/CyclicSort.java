package sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[]arr = {1,2,4,3,7,5,9,6,8};
        Cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
     /*cyclic sort is used when we have to sort the array form 0 to N or 1 to N
       for 0 to N correct would be equal to arr[i]
       and for 1 to N "Correct "would be equal to arr[i]-1
       then we just have to check the number whether its on its correct index or not
       if it is not on its correct index then we will just swap that with its correct index
       and if it is on its correct index then we will move the "i" to the next number
     */
    static void Cycle(int[] arr) {
        int i =0 ;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if ( arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }else
            {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
