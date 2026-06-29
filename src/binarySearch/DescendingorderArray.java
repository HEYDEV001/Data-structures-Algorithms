package binarySearch;

import java.util.Scanner;

public class DescendingorderArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[]arr= {99,77,66,63,59,58,55,44,12,};
        System.out.println("Enter the target");
        int target = in.nextInt();
       int ans =binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[]arr,int target){
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

