package HashMap.HashSet.Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindMinimumNumberOfSets {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,7,1,4,4,7,7};
        System.out.println(findMinSets(arr));
        System.out.println(findMinSets2(arr));

    }
    public static int findMinSets(int[] nums) {
        int count = 0;
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
               continue;
            }
            count++;
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < nums.length; j++) {
                if ( visited[j] || set.contains(nums[j])) {
                    continue;
                }
                visited[j] = true;
                set.add(nums[j]);
            }
        }

        return count;
    }

    public static int findMinSets2(int[] nums) {
        // In the above approach we can see that if a number is appearing more than 1 time a new set is getting created.
        // so if we can find the max frequency element then that will be equal to the number of sets requires to break this array into sets
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : nums){
            map.put(element,map.getOrDefault(element,0) + 1);
            count = Math.max(count, map.get(element));
        }
        return count;
    }
}
