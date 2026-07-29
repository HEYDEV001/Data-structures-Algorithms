package binarySearch.ShashCode.Questions.BitonicArray;

public class SplitArrayLargestSum {
    public static void main(String[] args) {

        int []nums  =  {7,2,5,8,10};
        int ans = splitArray(nums,2);
        System.out.println(ans);
    }
    public static int splitArray(int[] nums, int m) {
        int start  = 0 ;
        int end  = 0 ;

        for (int i  =0 ; i<nums.length ; i++) {
            end += nums[i];
            start  = Math.max(start,nums[i]); /// in the end of loop this will return the max value in the array
        }
        while (start < end) {
            int mid  = start + (end-start)/2;
            // calculate how many pieces you can divide the array
            int sum =0 ;
            int pieces = 1;
            for (int num : nums ){
                if (sum + num > mid ){
                    //this  means you can not add this in this subarray, make new one
                    sum = num ;
                    pieces ++;
                }
                else {
                    sum +=num;
                }
            }
            if (pieces >m) {
                start = mid+1;
            } else {
                end  = mid ;
            }

        }
        return end ;

    }
}
