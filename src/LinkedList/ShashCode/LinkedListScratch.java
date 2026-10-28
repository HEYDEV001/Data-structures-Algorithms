package LinkedList.ShashCode;

import java.util.Objects;

public class LinkedListScratch<T> {
    private Node<T> head;
    private Integer size;

    public LinkedListScratch() {
        this.head = null;
        this.size = 0;
    }
    public int size(){
        return this.size;
    }

    public void insertAtHead(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        // if node is present, so we will store its address in the newNode's next pointer
        // by pointing it to head because head contains the address of the first node(This is how we form a link first)
        // now to make the new node as head just point the head to the new node
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }


    public void insertAtTail(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        } // Above part will remain same as both insertAtHead & insertAtTail act similar when LinkedList is null
        // Now we will move a temp pointer till the last node
        // by checking the node's next pointer , because the next pointer of tail node contains null
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public void deleteAtTail() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node<T> current = head;
        Node<T> prev = null;
        while (current.next != null) { // this stops just before the tail node
            prev = current;
            current = current.next;
        }
        prev.next = null;
        size--;
    }


    public void insertAtPosition(T data, Integer position) {
        if (position > size + 1 || position < 0) {
            System.out.println("Not Possible");
            return;
        }
        if (position == 1) {
            insertAtHead(data);
            return;
        } else if (position == size + 1) {
            insertAtTail(data);
            return;
        }
        // Now we will move a current pointer just at the node at position -1
        // by checking the node's next pointer ,then we will form link newNode -> current.next  then current.next -> newNode
        Node<T> newNode = new Node<>(data);
        Node<T> current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;

    }

    public void deleteAtPosition( Integer position) {
        if (position > size || position < 0) {
            System.out.println("Not Possible");
            return;
        }
        if (position == 1) {
            deleteAtHead();
            return;
        } else if (position == size) {
            deleteAtTail();
            return;
        }
        // Now we will move a current pointer just at the node at position -1
        // by checking the node's next pointer
        Node<T> current = head;
        Node<T> prev = null;
        for (int i = 1; i < position ; i++) {
            prev = current;
            current = current.next;
        }
        assert prev != null;
        prev.next = current.next;
        current.next = null;
        size--;

    }


    public void updateNode(T updatedData, Integer position) {
        if (position > size || position < 0) {
            System.out.println("Not Possible");
            return;
        }

        Node<T> current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        current.data = updatedData;
        System.out.println("Updated data at position: " + position );


    }

    public boolean searchNode(T searchValue) {
        if(head == null){
            System.out.println("List is empty");
            return false;
        }
        Node<T> current = head;
        int position = 1;
        while (current != null) {
            if (Objects.equals(current.data, searchValue)) {
                System.out.println("Data found at position: " + position );
                return true;
            }
            current = current.next;
            position++;
        }
        System.out.println("Not Found");
        return false;
    }

    public void printList(){
        Node<T> current = head;
        while (current != null) {
            System.out.println("Data is -> " + current.data);
            current = current.next;
        }
    }


}

class Node<T> {
    T data;
    Node next;

    public Node() {
        this.next = null;
    }

    public Node(T data) {
        this.next = null;
        this.data = data;
    }
}
