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


    // Using Single Stack
    public int largestRectangleAreaUsingSingleStack(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i <=n ; i++){
            int element = (i==n) ? 0 : heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] > element){
                int h = heights[stack.pop()];
                int prevSmaller = (stack.isEmpty()) ? -1 : stack.peek();
                int width = i - prevSmaller -1;
                max = Math.max(max, h * width);
            }
            stack.push(i);
        }
        return (max == Integer.MIN_VALUE) ? 0 : max;
    }


    // Using Custom Stack
    public int largestRectangleAreaUsingCustomStack(int[] heights) {
        int n = heights.length;
        int[] stack = new int[n+1];
        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i <=n ; i++){
            int element = (i==n) ? 0 : heights[i];
            while((index!=-1) && heights[stack[index]] > element){
                int h = heights[stack[index--]];
                int nextSmaller = i;
                int prevSmaller = (index == -1) ? -1 : stack[index];
                int width = nextSmaller - prevSmaller -1;
                max = Math.max(max, h * width);
            }
            stack[++index] = i;
        }
        return (max == Integer.MIN_VALUE) ? 0 : max;
    }
}
