package binarySearch.ShashCode.Questions.BitonicArray;

import java.util.Scanner;

public class Leet34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

int[]nums = {5,7,7,8,8,8,9};
    }
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
int start = check(nums, target ,true);
int end = check(nums, target ,false);
ans[0]=start;
ans[1]=end;
return ans;

    }
// this function returns the index value of target
    int check(int[]nums ,int target ,boolean FindFirstIndex){
        int ans = -1;
        int start=0 ;
        int end=nums.length-1;
        int mid = start+(end-start)/2;
        while(start<=end){
            if (nums[mid]>target){
                end = mid-1;
            }
            else if (nums[mid]<target){
                start = mid+1;
            }
            else{
                // potential answer si found
                ans = mid ;
                if(FindFirstIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

        }return ans;
    }
}
