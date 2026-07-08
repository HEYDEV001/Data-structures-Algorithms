package LinkedList;

public class Main {
    public static void main(String[] args) {

//
        LL list = new LL();
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertFirst(7);
//        list.display();
//        System.out.println( list.find(3));
////        list.insertLast(1);
//
//        list.insert(22,3);
//
////        System.out.println( list.deleteFirst() );
//        list.display();
//
//        list.deleteLast();
//
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.deleteLast();
//        list.display();
//
//        list.delete(1);
//        list.display();

        // Doubly Linked List

//        DLL list1 = new DLL();
//        list1.insertFirst(11);
//        list1.insertFirst(12);
//        list1.insertFirst(13);
//        list1.insertFirst(14);
//        list1.insertFirst(15);
//        list1.insertFirst(16);
//        list1.insertFirst(17);
//        list1.insertFirst(18);
//        list1.insertFirst(19);
//
//        list1.insertLast(10);
//        list1.display();
//        list1.displayReverse();
//        list1.insert(19990, 3);
////        list1.display();
////        list1.displayReverse();
//        list1.insertAfter(13, 130);
//        list1.display();


        // Circular Linked List

        CircularLinkedList l = new CircularLinkedList();
        l.insert(10);
        l.insert(11);
        l.insert(12);
        l.insert(13);
        l.insert(14);
        l.insert(15);
        l.insert(16);
        l.insert(17);
        l.insert(18);
        l.insert(19);
        l.insert(20);
        l.printList();
        l.delete(17);

        l.printList();



//        list.insertRec(88,3);
//        list.display();
    }
}
