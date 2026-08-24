package HashMap.HashSet.Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraysWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {-1,2,3};
        System.out.println(subArraysWithSum(arr, 7));

    }
    public static ArrayList<Integer> subArraysWithSum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        res.add(-1);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum - target;
            if(map.containsKey(rem)){
                res.set(0, map.get(rem)+1);
                res.add(i);
                break;
            }
            map.put(sum, i);
        }
        return res;
    }
}
