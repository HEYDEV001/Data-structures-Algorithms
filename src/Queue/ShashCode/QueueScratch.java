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

    public void enqueue(T value) {
        if (isFull()) {
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        }else {
            rear++;
        }
        queue[rear] = value;
        System.out.println("Inserted " + value + " into the queue");
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is Empty");
            }
            T val = (T) queue[front];
            front = front + 1;
            if(front == rear){
                front = -1;
                rear = -1;
            }
            return val;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }else{
                return (T)queue[front];
            }

    }
    public int size() {
        return rear - front + 1;
    }

    public void printQueue(){
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        for (int i = 0; i <=rear; i++) {
            System.out.print(queue[i]);
            if(i != rear){
                System.out.print(",");
            }
        }
        System.out.println();
    }

}
