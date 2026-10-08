package Stack.Questions;

import java.util.ArrayList;
import java.util.Stack;

public class OnlineStockSpan {
}
class StockSpanner {

    ArrayList<Integer> list;
    Stack<Integer> stack ;
    public StockSpanner() {
        list = new ArrayList<>();
        stack = new Stack<>();
    }

    public int next(int price) {
        list.add(price);
        while(!stack.isEmpty() &&( price >= list.get(stack.peek()))){
            stack.pop();
        }
        int firstBigElement = (stack.isEmpty()) ? -1 : stack.peek();
        int currentIndex = list.size()-1;
        stack.push(currentIndex);
        return currentIndex - firstBigElement;
    }
}

/*
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */