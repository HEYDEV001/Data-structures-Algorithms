package Stacks_Queues;

import java.util.Arrays;

public class CustomStack {
    protected int[] data;
     private static final int DEFAULT_CAPACITY = 10;
      public CustomStack(){
         this(DEFAULT_CAPACITY);
     }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    private int top= -1;

      public void push(int item){
          if(isFull()){
              System.out.println("Stack is full");
          }
          top++;
          data[top] = item;
      }

    public boolean isFull() {
          return top == data.length-1;
    }

    public int pop() throws StackException {
          if(isEmpty()){
              System.out.println("Stack is empty");
              throw new StackException("Stack is empty");
          }
          return data[top--];
      }

      public int peek() throws StackException {
          if(isEmpty()){
              System.out.println("Stack is empty");
              throw new StackException("Stack is empty");
          }
          return data[top];
      }

    @Override
    public String toString() {
        return "{" +
                 Arrays.toString(data) +
                '}';
    }

    public boolean isEmpty() {
          return top == -1;
    }

}
