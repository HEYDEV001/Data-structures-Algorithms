package Stack.Questions;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        System.out.println(nextLargerElement(arr));
    }

    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                list.addFirst(-1);
            } else {
                list.addFirst(stack.peek());
            }
            stack.push(arr[i]);
        }
        return list;
    }
}
