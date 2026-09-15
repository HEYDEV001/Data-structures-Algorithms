package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] seen = new boolean[nums.length];
        permutations(nums, seen,current,result);
        return result;
    }
    public static void permutations(int[] nums, boolean[] seen, List<Integer> current, List<List<Integer>> result ){
        if(current.size() == nums.length){
            result.add(new ArrayList(current));
            return;
        }
        for(int i =0 ; i < nums.length ; i++){
            if(seen[i]) continue;
            if((i > 0) && nums[i] == nums[i-1] && !seen[i-1]) continue;
            seen[i] = true;
            current.add(nums[i]);
            // Pick
            permutations(nums,seen, current, result);
            // Removing for backtracking
            current.remove(current.size()-1);
            seen[i] = false;
        }
    }
}
