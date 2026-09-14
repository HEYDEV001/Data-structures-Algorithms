package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        permutations(nums ,current,result);
        return result;
    }
    public static void permutations(int[] nums,List<Integer> current,List<List<Integer>> result ){
        if(current.size() == nums.length){
            result.add(new ArrayList(current));
            return;
        }
        for(int i =0 ; i < nums.length ; i++){
            if(current.contains(nums[i])) continue;
            current.add(nums[i]);
            // Pick
            permutations(nums, current, result);
            // Removing for backtracking
            current.remove(current.size()-1);
        }
    }
}
