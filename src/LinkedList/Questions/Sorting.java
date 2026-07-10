package LinkedList.Questions;

public class Sorting {
    public static void main(String[] args) {



    }
    private Node head;
    private Node tail;
    private int size;
    public class Node {
        int val;
        Node next;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // Merge Sort:-
    /*
    public class Node {
        int val;
        Node next;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node mid = getMiddle(head);
        Node left = sortList(slow);
        Node right = sortList(fast);
        head = mergeTwoLists(left, right);
        return head;
    }

    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        while (list1 != null) {
            tail.next = list1;
            list1 = list1.next;
            tail = tail.next;
        }
        while (list2 != null) {
            tail.next = list2;
            list2 = list2.next;
            tail = tail.next;
        }
        return dummyHead.next;
    }
    Node getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

     */

    // bubbleSort :-

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void BubbleSort() {
        BubbleSort(size -1,0);
    }
    public void BubbleSort(int row, int col) {
        if(row==0){
            return;
        }
        if(col<row){
            Node  first  = get(col);
            Node  second = get(col+1);

            if(first.val > second.val){
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else{
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;

                }
            }
            BubbleSort(row, col+1);
        }else{
            BubbleSort(row-1, 0);
        }
    }
}
