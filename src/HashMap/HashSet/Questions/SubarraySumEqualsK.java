package HashMap.HashSet.Questions;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        System.out.println(subarraySum(arr,0));

    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int totalNumberOfSubArraysWithSumK = 0;
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum -k;
            totalNumberOfSubArraysWithSumK += map.getOrDefault(rem,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return totalNumberOfSubArraysWithSumK;
    }
}
