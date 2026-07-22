package LinearSearch;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4 ,5 ,6 ,1, 8, 9, 1};
        System.out.println(findFirstOccurrence(nums, 1));
        System.out.println(findLastOccurrence(nums, 1));
        System.out.println(findAllOccurrence(nums, 1));


    }

   public static int findFirstOccurrence(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
   }

   public static int findLastOccurrence(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int occurrence =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                occurrence = i;
            }
        }
        return occurrence;
   }

   public static List<Integer> findAllOccurrence(int[] arr, int target){
        if (arr == null || arr.length == 0) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                list.add(i);
            }
        }
        return list;
   }

}
