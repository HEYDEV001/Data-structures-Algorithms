package Queue.ShashCode;

import java.util.Stack;

public class QueueUsingStack<E> {
   Stack<E> stack1 ;
   Stack<E> stack2 ;
   public QueueUsingStack() {
       stack1 = new Stack<>();
       stack2 = new Stack<>();
   }
   public void enqueue(E val){
       stack1.push(val);
   }

   public E dequeue(){
       if(stack1.isEmpty()){
           return null;
       }
       while(!stack1.isEmpty()){
           stack2.push(stack1.pop());
       }
       E val = stack2.pop();
       while(!stack2.isEmpty()){
           stack1.push(stack2.pop());
       }
       return val;
   }

    public E peek(){
        if(stack1.isEmpty()){
            return null;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        E val = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val;
    }

    public int size(){
       return stack1.size();
    }

}
