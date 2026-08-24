package HashMap.HashSet.Questions;

import java.util.HashSet;

public class CheckKSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-1,2,3};
        System.out.println(checkKSumSubArray(arr, 4));

    }
    public static boolean checkKSumSubArray(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        set.add(0);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum-target;
            if(set.contains(rem)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
