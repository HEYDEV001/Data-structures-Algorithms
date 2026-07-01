package binarySearch;

import java.util.Scanner;

public class Floorofanumber {
    public static void main(String[] args) {
        // floor of an element is the greatest number which is less than or equal to target
        Scanner in = new Scanner(System.in);
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println("Enter the element to be searched: ");
        int target = in.nextInt();
        int ans = Floorofanumber(arr, target);
        System.out.println(ans);
    }
    static int Floorofanumber(int[] arr, int target) {
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
        return end;

    }
    }
