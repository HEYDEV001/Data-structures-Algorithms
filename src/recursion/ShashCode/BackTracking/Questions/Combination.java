package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backTrack(candidates, target,current, result, 0);
        return result;
    }
    public static void backTrack(int[] candidates, int target,List<Integer> current,List<List<Integer>> result, int index){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(index == candidates.length){
            return;
        }
        if(candidates[index]<= target){
            current.add(candidates[index]);
            backTrack(candidates, target - candidates[index],current, result, index);
            current.removeLast();
        }
        backTrack(candidates, target,current, result, index+1);
    }
}
