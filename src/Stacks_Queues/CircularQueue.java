package Stacks_Queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_CAPACITY = 10;
    public CircularQueue(){
        this(DEFAULT_CAPACITY);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    private int front= 0;
    private int end= 0;
    private int size= 0;

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front %  data.length;
        size--;
        return removed;
    }


    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }


    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int i= front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i%= data.length;
        }while(i != end);
        System.out.println("END");
    }
}
