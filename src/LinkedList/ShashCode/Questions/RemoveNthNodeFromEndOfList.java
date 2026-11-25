package LinkedList.ShashCode.Questions;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {

    }

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode first = head;
//        ListNode second  = head;
//        ListNode prev = null;
//
//        while(n > 0 && second != null){
//            n--;
//            second = second.next;
//        }
//        if(n != 0 ){
//            return head;
//        }
//        if(second == null){
//            ListNode temp = head;
//            head = head.next;
//            temp.next = null;
//            return head;
//        }
//
//        while(second != null){
//            prev = first;
//            first = first.next;
//            second = second.next;
//        }
//        prev.next = first.next;
//        first.next = null;
//        return head;
//    }
}
