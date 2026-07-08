package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertLast(int data) {

        if (tail == null) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size ++;

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

    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

// Leet21
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();

        while (f != null && s != null) {
            if (f.data < s.data) {
                ans.insertLast(f.data);
                f = f.next;
            }  else {
                ans.insertLast(s.data);
                s = s.next;
            }

        }
        while (f != null) {
            ans.insertLast(f.data);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.data);
            s = s.next;
        }
        return ans;
    }

    public void deleteLast(){
        if (size <= 1) {
            deleteFirst();
        }
        Node secondLast =get(size-2);// Here we have gone to the second last element of the linkedList
        // and then make it to point to null and make the tail to point to the second last index

        tail = secondLast;
        tail.next = null;
        size--;


    }

// This is to get the value of a particular index or reach to a particular index
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public void insert(int data ,int index ){
         if(index ==0) {
             insertFirst(data);
             return;
         }
         if(index==size) {
             insertLast(data);
             return;
         }
         Node temp = head;
         for (int i = 1; i < index; i++) {
             temp = temp.next;
         }
         Node newNode = new Node(data,temp.next);
         temp.next = newNode;
         size++;


    }
    public void delete(int index ){
        if(index ==0) {
           deleteFirst();
            return;
        }
        if(index==size-1) {
            deleteLast();
            return;
        }
    Node previousNode = get(index-1);
        previousNode.next = previousNode.next.next;
        size--;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (size == 1) {
            tail = newNode;
        }
        size += 1;
    }

    public void duplicate(Node head) {
        Node node = head;
        while (node.next != null) {
            if(node.data==node.next.data){
                node.next= node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail =node;
        tail.next = null;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Insertion using Recursion
    public void insertRec(int data, int index) {
        head = insertRec(data, index, head);
    }

    private Node insertRec(int data, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(data, node);
            size++;
            return newNode;
        }
        node.next = insertRec(data, index - 1, node.next);
        return node;
    }


    // Recursive reverse
    public void recReverse(Node node){
        if(node== tail){
            head = tail;
            return;
        }
        recReverse(node.next);
        tail.next = node;
        tail = node;
        tail.next= null;
    }


    // Reverse
    public void reverse(){
        Node prev = null;
        Node pres = head;
        Node Next = head.next;
        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = Next;
            if(Next!=null){
                Next= Next.next;
            }

        }
        head  = prev;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertFirst(1);
        first.insertFirst(3);
        first.insertFirst(5);
        first.display();
//        first.recReverse(first.head);
        first.reverse();
        first.display();

//        second.insertLast(1);
//        second.insertLast(2);
//        second.insertLast(9);
//      second.insertLast(14);
//
//        LL ans = LL.merge(first,second);
//        ans.display();

//        first.insertFirst(1);
//
//        first.insertFirst(2);
//        first.insertFirst(2);
//
//        first.insertFirst(3);
//        first.insertLast(4);


//        first.insertLast(4);
//        first.display();
//        first.duplicate(first.head);
//        first.display();

//         second.insertLast(5);
//         second.insertLast(6);
//         second.insertLast(7);
//         second.insertLast(8);
//         second.insertLast(9);
//         second.insertLast(10);

    }
}
