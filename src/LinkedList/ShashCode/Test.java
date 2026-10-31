package LinkedList.ShashCode;

public class Test {
    public static void main(String[] args) {
        LinkedListScratch<Integer> list   = new LinkedListScratch<>();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.printList();
        System.out.println();
        list.insertAtTail(6);
        list.insertAtTail(7);
        list.insertAtTail(8);
        list.printList();
        System.out.println();
        list.insertAtPosition(9, 4);
        list.printList();

        list.insertAtPosition(1, 13);

        System.out.println(list.size());

        list.deleteAtHead();
        System.out.println(list.size());

        list.printList();
        System.out.println();

        list.deleteAtTail();

        System.out.println(list.size());

        list.printList();
        System.out.println();
        list.deleteAtPosition( 13);
        System.out.println(list.size());
        list.printList();
        System.out.println();
        list.deleteAtPosition(4);

        list.printList();

        System.out.println();
//        LinkedListScratch<Character> linkedListScratch = new LinkedListScratch<>();
//        linkedListScratch.insertAtTail('a');
//        linkedListScratch.insertAtTail('b');
//        linkedListScratch.insertAtTail('c');
//        linkedListScratch.insertAtTail('d');
//        linkedListScratch.printList();
//
//        linkedListScratch.searchNode('c');
//        linkedListScratch.deleteAtPosition(3);
//        linkedListScratch.searchNode('c');
//        linkedListScratch.printList();
//        linkedListScratch.updateNode('c', 3);
//        linkedListScratch.printList();
//        System.out.println(linkedListScratch.searchNode('c'));


        DoublyLinkedListScratch<Character> linkedListScratch = new DoublyLinkedListScratch<>();
        linkedListScratch.insertAtTail('a');
        linkedListScratch.insertAtTail('b');
        linkedListScratch.insertAtTail('c');
        linkedListScratch.insertAtTail('d');
        linkedListScratch.printList();

        linkedListScratch.searchNode('c');
        linkedListScratch.deleteAtPosition(3);
        linkedListScratch.searchNode('c');
        linkedListScratch.printList();
        linkedListScratch.updateNode('c', 3);
        linkedListScratch.printList();
        System.out.println(linkedListScratch.searchNode('c'));
        linkedListScratch.printListReverse();



    }
}
