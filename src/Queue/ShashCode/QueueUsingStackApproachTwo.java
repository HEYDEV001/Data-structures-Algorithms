package Queue.ShashCode;

import java.util.Stack;

public class QueueUsingStackApproachTwo<E> {
    Stack<E> stack1 ;
    Stack<E> stack2 ;
    public QueueUsingStackApproachTwo() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void enqueue(E val){
        // First copy the all elements to the stack 2
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        // then push the current element to the stack 1 in order to maintain the order of elements
        stack1.push(val);
        // Then again copy the remaining elements to the stack 1
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public E dequeue(){
        if(stack1.isEmpty()){
            return null;
        }
        return stack1.pop();
    }

    public E peek(){
        if(stack1.isEmpty()){
            return null;
        }
        return stack1.peek();
    }

    public int size(){
        return stack1.size();
    }
}
