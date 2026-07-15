package collectionFrameworks;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Follows FIFO (First In First Out)
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue);
        System.out.println( queue.peek());
        queue.poll();
        System.out.println(queue);

        for(int ele: queue){
            System.out.print(ele);
        }
    }
}
