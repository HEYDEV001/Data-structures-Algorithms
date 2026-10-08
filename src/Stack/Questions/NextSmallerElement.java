package Stack.Questions;

import java.util.ArrayList;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack  = new Stack<>();
        int n = arr.length;
        for(int i = n-1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result.addFirst(-1);
            }else{
                result.addFirst(stack.peek());
            }
            stack.push(arr[i]);
        }
        return result;
    }
}
