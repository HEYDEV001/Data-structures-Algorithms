package HashMap.HashSet.Questions;

import java.util.HashMap;

public class SmallestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        System.out.println(smallestSubarray(arr,15));
    }
    public static int smallestSubarray(int[] arr, int target) {
        int sum = 0;
        int lengthOfLongestSubarray = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum - target;
            if(map.containsKey(rem)){
                lengthOfLongestSubarray = Math.min(lengthOfLongestSubarray, i - map.get(rem));
            }
            map.put(sum, map.getOrDefault(sum, i));
        }
        return lengthOfLongestSubarray;
    }
}
