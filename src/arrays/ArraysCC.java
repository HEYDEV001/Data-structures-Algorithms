package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCC {
    public static void main(String[] args) {

        // Declaration and Initialization of Array
        int[] arr= new int[10];
        int[] arr1 = new int[10];
        int[] arr2  = {1, 2, 3, 4, 5, 5,6 ,6, 7, 8, };


        // taking input at a particular index
        Scanner in = new Scanner(System.in);
        arr[0]=in.nextInt();
        arr[1]=in.nextInt();
        arr[2]=in.nextInt();

        System.out.println(Arrays.toString(arr));

    }

    
}
