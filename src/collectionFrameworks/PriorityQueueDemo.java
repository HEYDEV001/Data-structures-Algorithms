package collectionFrameworks;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Min PQ
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.offer(1);
        minPQ.offer(2);
        minPQ.offer(3);
        minPQ.offer(4);
        minPQ.offer(0);
        System.out.println(minPQ.peek());
        System.out.println(minPQ);
        minPQ.poll();
        System.out.println(minPQ);

        // Max PQ
        // Three ways are implemented below
//        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
//        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        maxPQ.offer(1);
        maxPQ.offer(2);
        maxPQ.offer(3);
        maxPQ.offer(4);
        maxPQ.offer(0);
        System.out.println(maxPQ.peek());
        System.out.println(maxPQ);
        maxPQ.poll();
        System.out.println(maxPQ);



    }
}
