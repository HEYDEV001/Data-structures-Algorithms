package collectionFrameworks;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new LinkedList<>(); -> same as ArrayDeque but better time and space complexity
        deque.offer(1);
        deque.offer(2);
        deque.offerFirst(10);
        deque.offerLast(11);
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.peek());
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);

    }
}
