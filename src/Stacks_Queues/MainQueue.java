package Stacks_Queues;

public class MainQueue {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new DynamicQueue(5);
        CircularQueue queue = new CircularQueue();

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
//        queue.insert(11);
//        queue.insert(12);
//        queue.insert(13);
//        queue.insert(14);
//        queue.insert(15);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(16);
        queue.display();
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        queue.display();
    }
}
