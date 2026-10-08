package Stack.Questions;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementLeet {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map  = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int n = nums2.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put( nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }
        int[] result = new int[nums1.length];
        for(int i = 0 ; i < nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
