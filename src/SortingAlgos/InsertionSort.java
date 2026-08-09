package SortingAlgos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // TC = O(n^2)
        // SC O(1)
        int [] arr  = {2, 34,5 ,3, 12,1 ,435 ,6 ,87};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }
    //ALGO:
    // At first we will consider the 1st element as sorted then we will compare the next element to the sorted part of the array
    // and place at its correct position

    /*
    For Ex:
    int [] arr  = {2, 34,5 ,3, 12,1 ,435 ,6 ,87};
    here 2 is considered as sorted part then we start from the 1st element i.e. 34
    no is 34 < 2
    if yes then we will take the 2 and put it at the position of 34 and 34 at pos of 2
    if no then we will continue with rest fo the elements
    now we are at 5
    is 5 < 34 (yes) then we will move 34 at position of 5(j will be at 34,and we will move it to j+1 pos) and move the j pointer at j-1 position
    then we will check with the element at j-1 pos if it is smaller the again we will follow above rule


    Here i will be the pointer of  key
    and j will be the pointer of element with which we will compare the key
    if key is greater, then  we will shift the jth element to j+1 pos
    and j  = j-1
    so that key can be compared to all the previous elements in the sorted part
     */
    public static int[] insertionSort(int[]arr){
        int n = arr.length;
        for(int i =1;i < n ; i++){
            int key = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
               arr[j+1] = arr[j];
               j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
