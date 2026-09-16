package recursion.ShashCode.BackTracking.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        combinations(0, candidates,  target, current, result);
        return result;
    }
    public static void combinations(int index,int[] candidates, int target,List<Integer> current,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        int n  = candidates.length;
        for( int i = index ; i<n; i++){
            if((i==index || candidates[i] != candidates[i-1]) && candidates[i] <= target){
                current.add(candidates[i]);
                combinations(i+1, candidates,  target- candidates[i], current, result);
                current.removeLast();
            }
        }
    }
}
