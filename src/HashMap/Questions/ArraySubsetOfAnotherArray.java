package HashMap.Questions;

import java.util.HashMap;

public class ArraySubsetOfAnotherArray {
    public static void main(String[] args) {
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
int [] arr2 = {1, 2, 3, 4, 1};
        System.out.println(isSubset(arr, arr2));
    }

    public static boolean isSubset(int[] a, int[] b) {
        // code here

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : a) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (int i : b) {
            if (map.containsKey(i)) {
                if (map.get(i) == 0) {
                    return false;
                }
                map.put(i, map.get(i) - 1);
            }else{
                return false;
            }
        }
        return true;
    }
}
