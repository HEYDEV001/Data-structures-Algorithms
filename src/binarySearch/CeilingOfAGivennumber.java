package binarySearch;

import java.util.Scanner;

public class CeilingOfAGivennumber {
    public static void main(String[] args) {
        //Ceiling of a number is the smallest element in the array greater or equal to the target element
        Scanner in = new Scanner(System.in);
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println("Enter the element to be searched: ");
        int target = in.nextInt();
        int ans = Ceilingofanumber(arr, target);
        System.out.println(ans);
    }

    static int Ceilingofanumber(int[] arr, int target) {
        if (target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] < target) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }

        }
        return start;
    }
}
