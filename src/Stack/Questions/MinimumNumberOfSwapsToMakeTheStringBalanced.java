package Stack.Questions;

import java.util.Stack;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public static void main(String[] args) {

    }
    public int minSwapsUsingStack(String s) {
        int n  = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty() || stack.peek() != '['){
                    stack.push(ch);
                }else{
                    stack.pop();
                }
            }
        }
        int pairCount = stack.size() / 2;
        return (pairCount + 1) / 2;
    }


    public int minSwaps(String s) {
        int n  = s.length();
        int open = 0 ;
        int close = 0 ;
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch == '['){
                open++;
            }else{
                if(open>0){
                    open--;
                }else{
                    close++;
                }
            }
        }
        return (open+1)/2;
    }
}
