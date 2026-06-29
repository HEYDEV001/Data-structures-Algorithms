package binarySearch;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        /*
        Given a sorted array which is [2,4,6,11,12,14,20,36,48]
        Step 1: Find the middle element
        Step 2:Check if the target element is > than the middle element then
        search on the right side of the middle element otherwise search on the left
        Step 3: if the middle element == to target element  ## this is the ans
        REPEAT THOSE STEPS UNTIL YOU FIND THE ANSWER
        Best case complexity is constant O(1)
        Worst case complexity is log(base2)(N)
         */
        // When the array is sorted in ascending order
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println("Enter the element to be searched: ");
        int target= in.nextInt();
        int ans =binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr,int target){
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
}
