package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        getSubSets(0, nums, current, result);
        return result;

    }

    public static void getSubSets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList(current));
            return;
        }
        // Add
        current.add(nums[index]);
        //Pick
        getSubSets(index + 1, nums, current, result);
        // removing while when the recursive call is over
        current.remove(current.size() - 1);
        // No pick
        getSubSets(index + 1, nums, current, result);
    }
}
