package HashMap.Questions;

import java.util.HashMap;

public class LongestSubArrayWithEqualNumberOf0sAnd1s {
    public static void main(String[] args) {
        int []arr = {1, 0, 1, 1, 1, 0, 0};
        System.out.println(maxLen(arr));

    }
    public static  int maxLen(int[] arr) {
        if(arr.length<=1){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxLength =0;
        int sum =0;
        for(int i =0; i<arr.length;i++){
            sum = (arr[i]==0) ? sum - 1 : sum +1;
            if(map.containsKey(sum)){
                int length = i - map.getOrDefault(sum,0);
                maxLength = Math.max(maxLength, length);
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLength;
    }
}
