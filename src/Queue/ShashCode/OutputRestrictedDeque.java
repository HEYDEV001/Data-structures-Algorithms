package Queue.ShashCode;

import java.util.Deque;

public class OutputRestrictedDeque<T> extends DequeScratch<T>{
    public OutputRestrictedDeque(int capacity) {
        super(capacity);
    }

    @Override
    public T deleteAtRear() {
        System.out.println("Deletion at rare is restricted");
        throw new UnsupportedOperationException(" Deletion at rear is not supported.");
    }

    public static void main(String[] args) {
        OutputRestrictedDeque<Integer> restrictedDeque = new OutputRestrictedDeque<>(10);
        restrictedDeque.insertRear(1);
        restrictedDeque.printDequeue();
        restrictedDeque.insertFront(2);
        restrictedDeque.printDequeue();
        restrictedDeque.deleteAtFront();
        restrictedDeque.printDequeue();
        restrictedDeque.insertFront(2);
        restrictedDeque.printDequeue();
        restrictedDeque.deleteAtRear();
        restrictedDeque.printDequeue();

    }
}
