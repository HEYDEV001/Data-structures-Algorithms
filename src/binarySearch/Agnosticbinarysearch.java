package binarySearch;

import java.util.Scanner;

public class Agnosticbinarysearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]arr = {1,2,2,3,3,4,5,6,7,8,9,10};
        //int []arr = {99,97,67,48,39,26,17,14,13,9};
        System.out.println("Enter the target");
        int target = in.nextInt();
        int start =0;
        int end =arr.length-1;
        if(arr[start]>arr[end]){
            System.out.println("Array is sorted in Descending order");
           int ans  = binarysearch2(arr,target);
            System.out.println(ans);
        }
        else{
            System.out.println("Array is sorted in Ascending order");
            int ans  = binarysearch1(arr,target);
            System.out.println(ans);
        }
    }
    static int binarysearch1(int[] arr,int target){
        int start =0 ;
        int end =arr.length-1;
        while(start <= end){
            int middle = start+(end-start)/2;

            if (arr[middle]<target){
                start= middle +1;
            }
            else if(target<arr[middle]){
                end=middle-1;
            }else {
                return middle ;
            }

        }
        return -1;
    }
    static int binarysearch2(int[]arr,int target){
        int start =0 ;
        int end =arr.length-1;
        while(start <= end){
            int middle = start+(end-start)/2;

            if (arr[middle]<target){
                end=middle-1;
            }
            else if(target<arr[middle]){
                start = middle+1;
            }else {
                return middle ;
            }

        }
        return -1;
    }
}
