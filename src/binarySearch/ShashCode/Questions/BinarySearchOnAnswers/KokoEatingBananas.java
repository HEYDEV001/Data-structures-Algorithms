package binarySearch.ShashCode.Questions.BinarySearchOnAnswers;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr = {3,6,17,11};
        System.out.println(minEatingSpeed(arr, 8));
    }
    public static  int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1;
        int end = piles[piles.length-1];
        int ans =-1;
        while(start<=end){
            int mid  = start+ (( end - start)/2);
            if(ifEatingPossible(piles, mid , h)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;

    }
    public static  boolean ifEatingPossible(int[] arr , int eatingSpeed, int totalHours){
        int hourCount  =0;
        for(int p : arr){
            hourCount  += (p/eatingSpeed);
            if(p%eatingSpeed!=0){
                hourCount ++;
            }
            if(hourCount>totalHours){
                return false;
            }
        }
        return true;
    }
}
