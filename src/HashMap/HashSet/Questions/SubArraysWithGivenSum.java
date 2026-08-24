package HashMap.HashSet.Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraysWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {0,0,1,4};
        System.out.println(subArraysWithSum(arr, 5));

    }
    public static ArrayList<Integer> subArraysWithSum(int[] arr, int target) {
//        ArrayList<Integer> res = new ArrayList<>();
//        int sum = 0;
//        res.add(-1);
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(0, -1);
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            int rem = sum - target;
//            if(map.containsKey(rem)){
//                res.set(0, map.get(rem)+2);
//                res.add(i+1);
//                break;
//            }
//            map.put(sum, i);
//        }
//        return res;

        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        res.add(-1);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum - target;
            if(map.containsKey(rem)){
                if((sum-arr[i]-arr[i-1]) ==0){
                    res.set(0,1);
                }
                res.set(0, map.get(rem)+2);
                res.add(i+1);
                break;
            }
            map.put(sum, i);
        }
        return res;
    }
}
