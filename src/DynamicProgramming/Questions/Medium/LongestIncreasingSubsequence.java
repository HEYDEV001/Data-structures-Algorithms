package DynamicProgramming.Questions.Medium;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {

    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] resultantArray  = new int[n];
        Arrays.fill(resultantArray, 1);
        int ans = 1;
        for(int index = 0 ; index < n ; index++){
            for(int current =0 ; current < index ; current++){
                if(nums[current] < nums[index]){
                    resultantArray[index] = Math.max(resultantArray[index], 1+resultantArray[current]);
                    ans = Math.max(ans, resultantArray[index]);
                }
            }
        }
        return ans;
    }
}
