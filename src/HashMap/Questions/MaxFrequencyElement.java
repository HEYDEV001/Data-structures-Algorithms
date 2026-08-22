package HashMap.Questions;

import java.util.HashMap;

public class MaxFrequencyElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9, 9, 9, 9};
        System.out.println(getMaxFrequencyElement(arr));

    }
    public static int getMaxFrequencyElement(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            // here we are saying that if the key is present then increase it by 1 and if it is not present then the default value will be 0 and increased by one so become 1
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i])>max){
                max = map.get(arr[i]);
                ans = arr[i];
            }
        }
        return ans;
    }

}
