package DynamicProgramming.Questions.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {

    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] resultantArray  = new int[n];
        Arrays.fill(resultantArray, 1);
        int ans = 1;
        for(int index = 0 ; index < n ; index++){
            for(int current =0 ; current < index ; current++){
                if(nums[current] < nums[index]){
                    resultantArray[index] = Math.max(resultantArray[index], 1+resultantArray[current]);

                }
            }
            ans = Math.max(ans, resultantArray[index]);
        }
        return ans;
    }

    public int printLIS(int[] nums) {
        int n = nums.length;
        int[] resultantArray  = new int[n];
        int[] previous  = new int[n];
        for(int i = 0 ;i < n ; i++){
            resultantArray[i] = 1;
            previous[i] = i;
        }
        int ans = 1;
        int maxIndex = 0 ;
        for(int index = 0 ; index < n ; index++){
            for(int current =0 ; current < index ; current++){
                if(nums[current] < nums[index]){
                    if(resultantArray[index] < 1 + resultantArray[current]){
                        resultantArray[index] = Math.max(resultantArray[index], 1+resultantArray[current]);
                        previous[index] = current;
                    }
                }
            }
            if(resultantArray[index] > ans){
                ans = resultantArray[index];
                maxIndex = index;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(maxIndex);
        while(maxIndex != previous[maxIndex]){
            maxIndex = previous[maxIndex];
            list.addFirst(nums[maxIndex]);
        }
        for(int i =0 ;i < list.size() ;i++){
            System.out.print(list.get(i)+",");
        }
        return ans;
    }
}
