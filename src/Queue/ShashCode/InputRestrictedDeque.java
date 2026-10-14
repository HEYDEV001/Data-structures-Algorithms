package Queue.ShashCode;

public class InputRestrictedDeque<T> extends DequeScratch{
    public InputRestrictedDeque(int capacity) {
        super(capacity);
    }

    @Override
    public void insertFront(Object value) {
        System.out.println("Inserting at front is Restricted");
        throw new UnsupportedOperationException(" Insertion at front is not supported.");
    }

    public static void main(String[] args) {
        InputRestrictedDeque<Integer> restrictedDeque = new InputRestrictedDeque<>(10);
        restrictedDeque.insertRear(1);
        restrictedDeque.printDequeue();
        restrictedDeque.insertFront(1);

    }

}
