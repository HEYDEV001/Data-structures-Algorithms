package HashMap.Questions;

import java.util.HashMap;

public class LongestSubArrayWithSumDivisibleByK {
    public static void main(String[] args) {
        int [] arr = {-2, 2, -5, 12, -11, -1, 7};
        System.out.println(longestSubarrayDivK(arr,3));

    }
    public static int longestSubarrayDivK(int[] arr, int k) {
        HashMap<Integer, Integer> map  = new HashMap<>();
        map.put(0,-1);
        int lengthOfLongestSubArrayDivisibleByK=0;
        int sum =0;
        for(int i = 0; i< arr.length;i++){
            sum += arr[i];
            int rem = sum % k;
            if(rem<0){
                rem = rem + k;
            }
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                lengthOfLongestSubArrayDivisibleByK = Math.max(lengthOfLongestSubArrayDivisibleByK,len);
            }else{
                map.put(rem,i);
            }
        }
        return lengthOfLongestSubArrayDivisibleByK;
    }
}
