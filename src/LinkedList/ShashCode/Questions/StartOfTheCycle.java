package LinkedList.ShashCode.Questions;

public class StartOfTheCycle {
    public static void main(String[] args) {

    }

    // This is to get the starting node of the cycle (Tweaked the original Question)
//    public ListNode firstNodeOfCycle(ListNode head){
//        if(head == null || head.next == null){
//            return false;
//        }
//        boolean isPresent = false;
//        ListNode slow = head;
//        ListNode fast = head;
//        while(fast != null && fast.next != null ){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast){
//                isPresent = true;
//                break;
//            }
//        }
//        if(isPresent == false){
//            return null;
//        }
//        slow = head;
//        while(slow != fast){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow;
//    }
}
