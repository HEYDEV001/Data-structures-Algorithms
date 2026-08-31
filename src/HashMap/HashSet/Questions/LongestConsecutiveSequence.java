package HashMap.HashSet.Questions;

import java.util.Arrays;
import java.util.HashSet;

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

    public int longestConsecutiveUsingHashSet(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums){
            set.add(val);
        }
        int maxLength =0;
        for(Integer ele : set){
            int prevEl = ele - 1;
            if(!set.contains(prevEl)){
                int length =1;
                int nextElement = ele + 1;
                while(set.contains(nextElement)){
                    length++;
                    nextElement++;
                }
                maxLength = Math.max(maxLength,length);
            }
        }


        return maxLength;
    }
}
