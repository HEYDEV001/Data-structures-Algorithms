package Stack.Questions;

import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = ((2*n) -1) ; i>= 0 ; i--){
            while(!stack.isEmpty() && nums[i%n] >= stack.peek()){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    result[i] =-1;
                }else{
                    result[i] = stack.peek();
                }
            }
            stack.push(nums[i%n]);
        }
        return result;
    }
}
