package Stack;

public class TestStack {
    public static void main(String[] args) {
        StackUsingQueue<Integer> stack = new StackUsingQueue<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.size());
        System.out.println("Peek is : " + stack.peek());
        System.out.println( "Popped Element is :" + stack.pop());
        stack.push(6);
        System.out.println("Peek is : " + stack.peek());
        System.out.println( "Popped Element is :" + stack.pop());
        System.out.println("Peek is : " + stack.peek());
        System.out.println( "Popped Element is :" + stack.pop());
    }
}
