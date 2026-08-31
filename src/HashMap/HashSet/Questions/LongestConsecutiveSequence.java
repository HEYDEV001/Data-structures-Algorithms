package HashMap.HashSet.Questions;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int maxLength =1;
        int length =1;
        int prev = nums[0];
        for(int i =1; i<nums.length;i++){
            if(prev==nums[i]){
                continue;
            }
            if(nums[i] == prev +1){
                length++;
            }else{
                length=1;
            }
            prev=nums[i];
            maxLength =Math.max(maxLength, length);
        }
        return maxLength;
    }
}
