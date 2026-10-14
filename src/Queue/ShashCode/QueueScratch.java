package Queue.ShashCode;

import java.util.Objects;

public class QueueScratch<T> {

    int front;
    int rear;
    int capacity;
    Object[] queue;

    public QueueScratch(int capacity) {
        this.capacity = capacity;
        front = -1;
        rear = -1;
        queue = new Object[capacity];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(Object value) {

        if (isFull()) {
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        }
        queue[rear] = value;
        rear++;
    }
    public Object dequeue() {
        try{
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return null;
            }
            Object val = queue[front];
            front = front + 1;
            return val;
        }catch (Exception e) {
            throw(new RuntimeException(e.getMessage()));

        }
    }

    public Object peek() {
        try{
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return null;
            }else{
                return queue[front];
            }
        }catch (Exception e) {
            throw(new RuntimeException(e.getMessage()));

        }
    }
    public int size() {
        return rear - front + 1;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < rear; i++) {
            System.out.print(queue[i]);
            if(i != rear-1){
                System.out.print(",");
            }
        }
    }

}
