package LinkedList;

public class CircularLinkedList {


    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }


    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

    }
public void printList() {
        Node current = head;
       if (head != null) {
           do{
               System.out.print(current.data + " -> ");
               current = current.next;
           }
           while(current != head);
           System.out.println("HEAD");
       }
}

public void delete(int data) {
        Node node = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            tail.next= head;
            return;
        }
        do{
            Node n= node.next;
            if(n.data == data){
                node.next = n.next;
                break;
            }
            node= node.next;

        }while(node != head);

}


    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

    }
}
