package Queue.ShashCode;

public class Test {
    public static void main(String[] args) {
        int n = 10;
        QueueScratch<Integer> queue = new QueueScratch<>(10);
        for(int i = 0; i < n; i++){
            queue.enqueue(i);
        }
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        queue.printQueue();
    }

}
