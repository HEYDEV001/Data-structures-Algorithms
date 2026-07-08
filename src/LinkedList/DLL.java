package LinkedList;

public class DLL {

    private Node head;
    private int size;


public void insertFirst(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    newNode.prev= null;
    if(head!= null){
        head.prev = newNode;
    }
    head = newNode;

}



    public Node find (int data) {
        Node node = head;
        while (node != null) {
            if (node.data == data) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void  insertAfter(int after,int data){
    Node newNode = new Node(data);
    Node p  = find(after);
    if(p == null){
        System.out.println("Node not found");
        return;
    }
    newNode.next = p.next;
    p.next = newNode;
    newNode.prev = p;
    if(p == null){

    }

    }

public void insertLast(int data) {

    Node node = new Node(data);
    Node last  = head;
    if(head == null){
        insertFirst(data);
    }
    while(last.next != null){
        last = last.next;
    }
    last.next = node;
    node.prev = last;
    node.next = null;
//    size++;
}

    public void insert(int data ,int index ){
        if(index ==0) {
            insertFirst(data);
            return;
        }
        if(index==size-1) {
            insertLast(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data,temp.next);
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
//        size++;


    }

public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+" -> ");
        temp = temp.next;
    }
    System.out.println("END");
}

    public void displayReverse(){
    Node temp = head;
    Node last  = null;
        while(temp != null){
          last = temp;
          temp = temp.next;
        }


        while(last != null){
            System.out.print(  last.data+" <- ");
            last = last.prev;
        }
        System.out.println("START");
    }



    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }
}
