package Stack.Questions;

import java.util.ArrayList;
import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {

    }
    public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        removeValidParantheses(s, stack);
        if(stack.isEmpty()){
            return s.length();
        }
        ArrayList<Integer> list = new ArrayList<>();
        formArayOfInvalidIndex(s, list, stack);

        for(int i =1; i < list.size(); i++){
            int prev = list.get(i-1);
            max = Math.max(max, list.get(i) - prev -1);
        }
        return max;
    }
    private void removeValidParantheses(String s, Stack<Integer> stack){
        for(int i = 0 ; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }else{
                if(stack.isEmpty() || s.charAt(stack.peek()) == ')'){
                    stack.push(i);
                }else{
                    stack.pop();
                }
            }
        }
    }
    private void formArayOfInvalidIndex(String s, ArrayList<Integer> arr, Stack<Integer> stack){
        arr.add(0, s.length());
        while(!stack.isEmpty()){
            arr.add(0, stack.pop());
        }
        arr.add(0, -1);
    }




    public int longestValidParenthesesUsingSingleStack(String s) {
        int n = s.length();
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i =0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                max = Math.max(max, i - stack.peek());
            }
        }
        return max;
    }
}
