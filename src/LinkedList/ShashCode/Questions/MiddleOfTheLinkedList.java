package LinkedList.ShashCode.Questions;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        // fast and Slow pointer approach
        ListNode fastNode = head;
        ListNode slowNode = head;
        while(fastNode != null && fastNode.next!=null){
            fastNode = fastNode.next.next; // Jumping two nodes
            slowNode = slowNode.next; // jumping to next node
        }
        return slowNode;
    }
}
