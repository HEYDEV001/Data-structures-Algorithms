package Stack.Questions;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {

    }
    public int largestRectangleArea(int[] heights) {
        int[] nextSmaller = nextSmaller(heights);
        int[] prevSmaller = prevSmaller(heights);
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0 ; i < heights.length; i++){
            int currentArea = (nextSmaller[i] - prevSmaller[i] -1) * heights[i];
            maxArea = Math.max(maxArea,currentArea);
        }
        return maxArea;
    }
    private int[] nextSmaller(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack  = new Stack<>();
        for(int i = n-1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = n;
            }else{
                result[i] = stack.peek()
                ;            }
            stack.push(i);
        }
        return result;
    }

    private int[] prevSmaller(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack  = new Stack<>();
        for(int i = 0 ; i<n ; i++){
            while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek()
                ;            }
            stack.push(i);
        }
        return result;
    }
}
