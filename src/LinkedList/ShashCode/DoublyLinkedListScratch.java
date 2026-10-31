package LinkedList.ShashCode;

import java.util.Objects;

public class DoublyLinkedListScratch<T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private Integer size;

    public DoublyLinkedListScratch() {
        this.head = null;
        this.size = 0;
        this.tail = null;
    }


    public int size(){
        return this.size;
    }

    public void insertAtHead(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        // if node is present, so we will store its address in the newNode's next pointer and head's prev pointer.
        // by pointing it to head because head contains the address of the first node(This is how we form a link first)
        // now to make the new node as head just point the head to the new node
        newNode.next = head;
        head.prev = newNode;
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
            tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }


    public void insertAtTail(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        } // Above part will remain same as both insertAtHead & insertAtTail act similar when LinkedList is null
        // Now we will move a temp pointer till the last node
        // by checking the node's next pointer , because the next pointer of tail node contains null
        DoublyNode<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
        size++;
    }

    public void deleteAtTail() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            return;
        }
        DoublyNode<T> currentNode = head;
        DoublyNode<T> previousNode = null;
        while (currentNode.next != null) { // this stops just before the tail node
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = null;
        currentNode.prev = null;
        tail = previousNode;
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
        // Now we will move a currentNode pointer just at the node at position -1
        // by checking the node's next pointer ,then we will form link newNode -> currentNode.next  then currentNode.next -> newNode
        DoublyNode<T> newNode = new DoublyNode<>(data);
        DoublyNode<T> currentNode = head;
        DoublyNode<T> previousNode = null;
        for (int i = 1; i < position ; i++) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        currentNode.prev =newNode;
        newNode.next = currentNode;
        assert previousNode != null;
        previousNode.next = newNode;
        newNode.prev = previousNode;
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
        // Now we will move a currentNode pointer just at the node at position -1
        // by checking the node's next pointer
        DoublyNode<T> currentNode = head;
        DoublyNode<T> previousNode = null;
        for (int i = 1; i < position ; i++) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        DoublyNode nextNode = currentNode.next;
        assert nextNode != null;
        assert previousNode != null;
        previousNode.next = nextNode;
        nextNode.prev = previousNode;
        currentNode.prev = null;
        currentNode.next =null;
        size--;

    }


    public void updateNode(T updatedData, Integer position) {
        if (position > size || position < 0) {
            System.out.println("Not Possible");
            return;
        }

        DoublyNode<T> current = head;
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
        DoublyNode<T> current = head;
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
        DoublyNode<T> current = head;
        while (current != null) {
            System.out.println("Data is -> " + current.data);
            current = current.next;
        }
    }

    public void printListReverse(){
        DoublyNode<T> current = tail;
        while (current != null) {
            System.out.println("Data is -> " + current.data);
            current = current.prev;
        }
    }

}
class DoublyNode<T> {
    T data;
    DoublyNode next;
    DoublyNode prev;
    public DoublyNode() {
        next = null;
        prev = null;
    }
    public DoublyNode(T data) {
        this.data = data;
        next = null;
        prev = null;
    }
}
