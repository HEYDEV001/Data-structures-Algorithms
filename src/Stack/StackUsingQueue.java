package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<E> {
    Queue<E> queue1;
    Queue<E> queue2;
    public StackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(E value) {
        if(queue1.isEmpty()){
            queue1.offer(value);
        }else{
            while(!queue1.isEmpty()){
                queue2.offer(queue1.poll());
            }
            queue1.offer(value);
            while(!queue2.isEmpty()){
                queue1.offer(queue2.poll());
            }
        }

    }

    public E pop() {
        if(queue1.isEmpty()){
            return null;
        }else{
            return queue1.poll();
        }
    }

    public E peek() {
        if(queue1.isEmpty()){
            return null;
        }
        return queue1.peek();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }
    public int size(){
        return queue1.size();
    }
}
