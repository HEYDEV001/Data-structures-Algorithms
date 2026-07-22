package bitManipulation.ShashCode.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }
    public  static List<List<Integer>> subsets(int[] nums) {
        // Doing it via BitManipulation
        // We will do it again by BackTracking
        int totalNumberOfPowerSets = (1 << nums.length);
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0; i<totalNumberOfPowerSets;i++){
            List<Integer> list = new ArrayList<>();
            for(int j =0; j<nums.length; j++){
                if((i  & (1<<j))!= 0){
                    list.add(nums[j]);
                }
            }
            result.add(list);

        }
        return result;


    }
}
