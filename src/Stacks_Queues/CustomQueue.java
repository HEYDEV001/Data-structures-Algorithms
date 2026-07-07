package Stacks_Queues;

import java.util.Arrays;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_CAPACITY = 10;
    public CustomQueue(){
        this(DEFAULT_CAPACITY);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    private int end= 0;

    public void insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        data[end] = item;
        end++;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        for (int i = 1; i <end; i++){
            data[i-1]= data[i] ;
        }
        end--;
        return removed;
    }


    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    @Override
    public String toString() {
        return "CustomQueue{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "<-");
        }
        System.out.println("END");
}
    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }
}
