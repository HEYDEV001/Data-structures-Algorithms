package LinkedList.Questions;

public class Leet234 {



//    public boolean isPalindrome(ListNode head) {
//        ListNode mid = mid(head);
//        ListNode headSecond = reverse(mid);
//        ListNode reReversehead = headSecond;
//        ListNode first = head;
//        ListNode second  = mid;
//        while( head!=null&&headSecond!= null){
//            if(head.val != headSecond.val){
//                break;
//            }
//            head = head.next;
//            headSecond = headSecond.next;
//        }
//        reverse(reReversehead);
//        return head==null || headSecond == null;
//
//
//    }
//    public ListNode reverse(ListNode head){
//        ListNode prev = null;
//        ListNode pres = head;
//        ListNode Next = head.next;
//        while(pres!=null){
//            pres.next = prev;
//            prev = pres;
//            pres = Next;
//            if(Next!=null){
//                Next= Next.next;
//            }
//
//        }
//        return prev;
//    }
//    public ListNode mid(ListNode head){
//        ListNode fast = head;
//        ListNode slow = head ;
//        while(fast!= null&& fast.next != null){
//            fast= fast.next.next;
//            slow = slow.next;
//        }
//        return slow;
//    }


}
