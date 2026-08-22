package HashMap.Questions;

import java.util.HashMap;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,5, 7, 1};
        System.out.println(countPairs(arr, 6));

    }
    public static int countPairs(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int j =0;j<nums.length;j++){
            if(j> target){
                continue;
            }
            int rem = target-nums[j];
            if(map.getOrDefault(rem, 0)>0){
                count += map.get(rem);
                map.put(rem, map.get(rem) - 1);
                if(j == rem){
                    count-=1;
                }
            }


        }
        return count;
    }
}
