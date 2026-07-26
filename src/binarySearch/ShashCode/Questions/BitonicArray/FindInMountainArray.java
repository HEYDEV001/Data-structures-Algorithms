package binarySearch.ShashCode.Questions.BitonicArray;

import java.util.Spliterator;

public class FindInMountainArray {
    public static void main(String[] args) {
        int [] arr = {0,5,3,1};
        System.out.println(findInMountainArray(1,arr));
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak  =getPeak(mountainArr);
        int start = 0;
        int end = peak;
        while(start<=end){
            int mid = start + ((end-start)/2);
            int curr = mountainArr[mid];
            if(curr == target){
                return mid;
            }else if(target > curr){
                start = mid +1;
            }else{
                end  = mid -1;
            }
        }
        start = peak+1;
        end = mountainArr.length -1;
        while(start<=end){
            int mid = start + ((end-start)/2);
            int curr = mountainArr[mid];
            if(curr == target){
                return mid;
            }else if(target > curr){
                end  = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;

    }
    public static int getPeak(int[] mn){
        int n = mn.length;
        int start = 0;
        int end = n-1;
        while(start<= end){
            int mid = start +((end-start)/2);
            int curr = mn[mid];
            if(mid !=0 && mid != n-1 && curr > mn[mid+1] && curr  > mn[mid-1]){
                return mid;
            }else if(mid != n-1 && mn[mid] < mn[mid+1]){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
