package recursion.Level_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterative_Method {
    public static void main(String[] args) {
int[] arr = {2,1,2,2,2};
//        List<List<Integer>> ans  = subset(arr);
        List<List<Integer>> ans  = subsetduplicate(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subset(int[]arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
             int Size = outer.size();
             for(int i=0; i<Size; i++){
                 List<Integer> Internal = new ArrayList<>(outer.get(i));
                 Internal.add(num);
                 outer.add(Internal);
             }
        }
        return outer;
    }


    static List<List<Integer>> subsetduplicate(int[]arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0 ;
        int end =0 ;
        for (int i = 0; i < arr.length; i++) {
          start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end+1;
            }
         end = outer.size() - 1;
            int Size = outer.size();
            for (int j = 0; j < Size; j++) {
                 List<Integer> Internal = new ArrayList<>(outer.get(j));
                Internal.add(i);
                outer.add(Internal);
            }
        }
        return outer;
    }
}
