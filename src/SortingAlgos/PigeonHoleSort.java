package SortingAlgos;

import java.util.Arrays;

public class PigeonHoleSort {
    public static void main(String[] args) {
        int [] arr  = {2, 34,5 ,3, 12,1 ,435 ,6 ,87};
        System.out.println(Arrays.toString(pigeonholeSort(arr)));
    }
    public static int[] pigeonholeSort(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int k : arr) {
            if (k > max) {
                max = k;
            }
            if (k < min) {
                min = k;
            }
        }
        if(max == Integer.MIN_VALUE || min == Integer.MAX_VALUE) {
            return new int[0];
        }
        int size = max - min + 1;
        int[] pigeonHole = new int[size];

        for (int i = 0; i < n; i++) {
            int index = arr[i] - min;
            pigeonHole[index]++;
        }
        int insertionIndex = 0;
        for (int j = 0; j < size; j++) {
            while (pigeonHole[j] > 0) {
                arr[insertionIndex] = j + min;
                insertionIndex++;
                pigeonHole[j]--;
            }
        }

        return arr;

    }
}
