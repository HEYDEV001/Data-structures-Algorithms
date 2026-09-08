package SlidingWindow.Questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));

    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque =  new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        int index =0;
        while(index<k){
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[index]){
                deque.pollLast();
            }
            deque.offerLast(index);
            index++;
        }
        res[0] = nums[deque.peekFirst()];
        for(int i=1;i<nums.length - k +1;i++){
            if(!deque.isEmpty() && deque.peekFirst()<=(i-1)){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i+k-1]){
                deque.pollLast();
            }
            deque.offerLast(i+k-1);
            res[i] = nums[deque.peekFirst()];
        }
        return res;
    }
}
