package arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Key btw 1 & 10: ");
        int key = in.nextInt();
       int index = linearSearch(arr, key);
       if(index == -1){
           System.out.println("Element not found");
       }else{
           System.out.println("Element found at index " + index);
       }
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
