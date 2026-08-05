package binarySearch.ShashCode.Questions.BinarySearchOnAnswers;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {

        int []  arr  = {1, 2,4, 8, 9};
        System.out.println(aggressiveCows(arr, 3));
    }
    public static  int aggressiveCows(int[] arr, int k) {

        Arrays.sort(arr);
        int start = Integer.MAX_VALUE;
        int end =0;
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            start = Math.min(arr[i+1]-arr[i],start);
        }
        end  = arr[n-1] - arr[0];
        int ans = -1;
        while(start<=end){
            int mid = start + ((end-start)/2);
            if(isAllocationPossible(arr, mid, k)){
                ans = mid;
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }

    public static boolean isAllocationPossible(int[] arr, int minimumDistance, int totalCows){
        int cow =1;
        int lastPosition= arr[0];
        for(int i=1;i<arr.length-1;i++){
            if((arr[i]- lastPosition) >= minimumDistance){
                cow++;
                lastPosition=arr[i];

            }if(cow >= totalCows){
                return true;
            }
        }
        return false;
    }
}
