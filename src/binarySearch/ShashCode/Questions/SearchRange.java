package binarySearch.ShashCode.Questions;

import java.time.chrono.IsoEra;
import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,5,5,5,5,10,11,12,13,14};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(arr,target)));

        System.out.println(numberOfOccurrences(arr, target));
    }

    // Asked In GOOGLE
    public static int numberOfOccurrences(int[] arr, int target) {
        int [] ans  = {-1,-1};
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
        if(ans[0] == -1 || ans[1] == -1){
            return 0;
        }else{
            return ans[1] - ans[0] + 1;
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int [] ans  = {-1,-1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }
     public static int search (int[] arr, int target, boolean isFirst){
        int ans  =-1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + ((end-start)/2);
            if(target == arr[mid]){
                ans = mid;
                if(isFirst){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
            else if (target > arr[mid]){
                start = mid +1;

            }else{
                end = mid -1;
            }

        }
        return ans;
    }
}
