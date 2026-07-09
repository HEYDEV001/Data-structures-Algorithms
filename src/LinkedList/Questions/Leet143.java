package LinkedList.Questions;

public class Leet143 {


//    public void reorderList(ListNode head) {
//        if(head== null|| head.next== null){
//            return;
//        }
//        ListNode mid  = middle(head);
//        ListNode hf  = head;
//        ListNode hs  = reverse(mid);
//        while(hf!= null && hs != null){
//            ListNode temp  =hf.next;
//            hf.next = hs;
//            hf = temp;
//
//            temp = hs.next;
//            hs.next =hf;
//            hs = temp ;
//        }
//        if(hf!= null){
//            hf.next = null;
//        }
//
//    }
//
//    public ListNode middle(ListNode head){
//        ListNode f= head;
//        ListNode s= head;
//        while(f!= null && f.next!= null){
//            f= f.next.next;
//            s = s.next;
//        }
//        return s;
//    }
//
//    public ListNode reverse(ListNode head){
//        ListNode node = null;
//        while(head!= null){
//            ListNode temp  = head.next;
//            head.next = node;
//            node = head;
//            head = temp;
//        }
//        return node;
//    }
}
