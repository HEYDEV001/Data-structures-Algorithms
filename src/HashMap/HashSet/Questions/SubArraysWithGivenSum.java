package HashMap.HashSet.Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraysWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {38, 28, 21, 6 ,28, 38, 11, 34, 4, 38, 34, 42, 36, 22};
        System.out.println(subArraysWithSum(arr, 28));

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
                if(i>0 && (i-1)>0 && (sum-arr[i]-arr[i-1])  ==0){
                    res.set(0,1);
                }else{
                    res.set(0, map.get(rem)+2);
                }
                res.add(i+1);
                break;
            }
            map.put(sum, i);
        }
        return res;
    }
}
