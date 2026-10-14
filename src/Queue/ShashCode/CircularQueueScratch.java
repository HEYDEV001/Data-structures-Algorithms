package Queue.ShashCode;

public class CircularQueueScratch<T> {
    int front;
    int rear;
    int capacity;
    int size;
    Object[] queue;

    public CircularQueueScratch(int capacity) {
        this.capacity = capacity;
        front = -1;
        rear = -1;
        size =0;
        queue = new Object[capacity];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(T value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        }else{
            rear++;
        }
        queue[rear % capacity] = value;
        System.out.println("Inserted " + value + " into the queue");
        size++;
    }
    public Object dequeue() {
        try{
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return null;
            }
            Object val = queue[front % capacity] ;

            if(front == rear){
                front = -1;
                rear = -1;
            }else{
                front = front + 1;
            }
            size--;
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
                return queue[front % capacity];
            }
        }catch (Exception e) {
            throw(new RuntimeException(e.getMessage()));

        }
    }
    public int size() {
        return size;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <=rear; i++) {
            System.out.print(queue[i % capacity]);
            if(i != rear){
                System.out.print(",");
            }
        }
        System.out.println();
    }

}
