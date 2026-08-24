package HashMap.HashSet.Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        System.out.println(longestSubarray(arr,15));

    }
    public static int longestSubarray(int[] arr, int target) {
        int sum = 0;
        int lengthOfLongestSubarray = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum - target;
            if(map.containsKey(rem)){
                lengthOfLongestSubarray = Math.max(lengthOfLongestSubarray, i - map.get(rem));
            }
            map.put(sum, map.getOrDefault(sum, i));
        }
        return lengthOfLongestSubarray;
    }


}
