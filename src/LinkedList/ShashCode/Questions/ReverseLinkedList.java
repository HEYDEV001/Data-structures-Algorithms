package LinkedList.ShashCode.Questions;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        // Iterative approach
        ListNode prev = null;
        ListNode current = head;
        while(current !=null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public ListNode reverseList(ListNode head) {
        // Recursive Approach
        if(head == null || head.next == null){
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }



}
