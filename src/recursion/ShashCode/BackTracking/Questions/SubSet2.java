package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Leet -90
public class SubSet2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(subsetsWithDup(nums));
    }
    public static  List<List<Integer>> subsetsWithDup(int[] nums) {
        // sort to get all duplicates get lined up
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        getSubSets(0,nums ,current,result);
        return result;
    }

    public static void getSubSets(int index, int[] nums , List<Integer> current, List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList(current));
            return;
        }
        // Add
        current.add(nums[index]);
        //Pick
        getSubSets(index +1,nums ,current,result);
        // removing while when the recursive call is over
        current.remove(current.size()-1);
        // No pick
        //skip all duplicated while not picking (So that if you're not picking 2 then all the 2's must be avoided)
        while((index+1) < nums.length && nums[index] == nums[index+1]){
            index++;
        }
        getSubSets(index +1,nums ,current,result);
    }
}
