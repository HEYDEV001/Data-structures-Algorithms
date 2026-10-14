package Queue.ShashCode;

public class DequeScratch<T> {
    int front;
    int rear;
    int capacity;
    int size;
    Object[] deque;

    public DequeScratch(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = 0;
        size =0;
        deque = new Object[capacity];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }
    @SuppressWarnings("unchecked")
    public T peekFront() {
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }else{
            return (T) deque[front];
        }
    }

    @SuppressWarnings("unchecked")
    public T peekRear() {
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }else{
            return (T) deque[(rear-1 + capacity) % capacity];
        }
    }

    public void insertFront(T value) {
        if(isFull()){
            throw new IllegalStateException("Queue is full");
        }
        front = (front - 1 + capacity) % capacity ;
        deque[front] = value;
        size++;
    }

    public void insertRear(T value) {
        if(isFull()){
            throw new IllegalStateException("Queue is full");
        }
        deque[rear] = value;
        rear = (rear + 1)  % capacity;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T deleteAtFront() {
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty; deletion cannot be performed");
        }
        T val = (T) deque[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    @SuppressWarnings("unchecked")
    public T deleteAtRear() {
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty; deletion cannot be performed");
        }
        front = (rear -1 + capacity) % capacity;
        T val = (T) deque[rear];
        size--;
        return val;
    }

    public void printDequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        int j  = front;
        for (int i = 0; i <size; i++) {
            System.out.print(deque[j] + " ");
            j = (j + 1) % capacity;
        }
        System.out.println();
    }
}
