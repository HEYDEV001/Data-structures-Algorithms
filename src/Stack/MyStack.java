package Stack;

public class MyStack {

    private int[] stack;
    private int size;
    private int top;

    MyStack(int stackSize){
        stack = new int[stackSize];
        this.size = stackSize;
        top = -1;
    }
    public void push(int data){
        if(top == size-1){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
        System.out.println(data + " is added to the stack at " + top);
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[top--];
    }
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }
    public boolean isEmpty(){
        return top ==-1;
    }

    public int size(){
        return size;
    }
    public void printStack(){
        for(int i = top; i >=0; i--){
            System.out.println(stack[i]);
        }
    }
    public void printStackReverse(){
        for(int i = 0; i <=top; i++){
            System.out.println(stack[i]);
        }
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
//        myStack.printStack();
        myStack.printStackReverse();
//        System.out.println(myStack.peek());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.peek());
//        System.out.println(myStack.isEmpty());

    }
}
