package LinkedList.ShashCode.Questions;

public class ReverseNodesInkGroup {
    public static void main(String[] args) {

    }
//    private int len(ListNode head){
//        int count = 0;
//        while(head != null){
//            count++;
//            head = head.next;
//        }
//        return count;
//    }
//    public ListNode reverseKGroup(ListNode head, int k) {
//        int len = len(head);
//        ListNode prevHead = null;
//        ListNode currentHead = head;
//        ListNode ansNode = null;
//        int counter = 0;
//        while(counter < (len/k)){
//            ListNode prev = null;
//            ListNode current = currentHead ;
//            ListNode nextNode = null;
//            for(int i= 0 ; i < k; i++){
//                nextNode  = current.next;
//                current.next = prev;
//                prev= current;
//                current = nextNode;
//            }
//            if(prevHead == null){
//                ansNode = prev;
//            }else{
//                prevHead.next = prev;
//            }
//            prevHead = currentHead;
//            currentHead = current;
//            counter++;
//        }
//        // to link Last remaining nodes
//        prevHead.next = currentHead;
//        return ansNode;
//
//    }
}
