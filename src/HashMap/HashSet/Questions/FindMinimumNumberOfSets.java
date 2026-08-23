package HashMap.HashSet.Questions;

import java.util.HashSet;
import java.util.Set;

public class FindMinimumNumberOfSets {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,7,1,4,4,7,7,7};
        System.out.println(findMinSets(arr));

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
}
