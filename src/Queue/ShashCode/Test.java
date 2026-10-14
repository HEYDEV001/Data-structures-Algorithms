package Queue.ShashCode;


public class Test {
    public static void main(String[] args) {
        int n = 10;
        QueueScratch<Integer> queue = new QueueScratch<>(10);
        for(int i = 0; i < n; i++){
            queue.enqueue(i );
        }
        System.out.println(queue.isFull());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.isFull());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        queue.printQueue();


        QueueScratch<String> stringQueue = new QueueScratch<>(10);
        for(int i = 0; i < n; i++){
            stringQueue.enqueue((i+1) + " apple");
        }
        System.out.println(stringQueue.size());
        stringQueue.printQueue();



        CircularQueueScratch<Integer> circularQueueScratch = new CircularQueueScratch<>(10);
        for(int i = 0; i < n; i++){
            circularQueueScratch.enqueue((i+1));
        }
        System.out.println(circularQueueScratch.size());
        circularQueueScratch.printQueue();
        System.out.println(circularQueueScratch.dequeue());
        System.out.println(circularQueueScratch.isFull());
        System.out.println(circularQueueScratch.size());
        circularQueueScratch.enqueue(11);
        circularQueueScratch.printQueue();



    }

}
