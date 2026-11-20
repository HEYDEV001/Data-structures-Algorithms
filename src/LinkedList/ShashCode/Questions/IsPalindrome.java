package LinkedList.ShashCode.Questions;

public class IsPalindrome {
    public static void main(String[] args) {

    }
    // First Approach
//    public boolean isPalindrome(ListNode head) {
//        ListNode slow = head;
//        ListNode prev = null;
//        ListNode fast = head;
//        ListNode newListHead = null;
//        while(fast != null && fast.next!= null){
//            prev = slow ;
//            slow = slow .next ;
//            fast = fast.next.next;
//            if(newListHead == null){
//                newListHead = new ListNode(prev.val);
//            }else{
//                ListNode node = new ListNode(prev.val);
//                node.next = newListHead;
//                newListHead = node;
//            }
//        }
//
//        if(fast != null){
//            slow = slow.next;
//        }
//        while(slow != null && newListHead != null){
//            if(slow.val != newListHead.val){
//                return false;
//            }
//            slow = slow.next;
//            newListHead = newListHead.next;
//        }
//        return true;
//    }

    // Revision Time
//    public boolean isPalindrome(ListNode head) {
//
//        ListNode slow = head;
//        ListNode fast = head;
//        ListNode prev = null;
//        ListNode newListHead = null;
//        // Creating newReversed part while finding middle
//        while(fast != null && fast.next != null){
//            prev = slow;
//            slow = slow.next;
//            fast = fast.next.next;
//            if(newListHead == null){
//                newListHead = new ListNode(prev.val);
//            }else{
//                ListNode newNode = new ListNode(prev.val);
//                newNode.next = newListHead;
//                newListHead = newNode;
//            }
//        }
//
//        if(fast != null){
//            slow = slow.next;
//        }
//        while(newListHead != null && slow!= null){
//            if(slow.val == newListHead.val){
//                slow = slow.next;
//                newListHead= newListHead.next;
//            }else{
//                return false;
//            }
//        }
//        return true;
//    }


    // Recursive Approach

//    public boolean isPalindrome(ListNode head) {
//        if(head == null || head.next == null){
//            return true;
//        }
//        ListNode middle = findMiddle(head);
//        ListNode tail = reverse(middle);
//        while(tail != null){
//            if(head.val != tail.val){
//                return false;
//            }
//            head = head.next ;
//            tail = tail.next;
//        }
//
//        return true;
//    }
//    private ListNode reverse(ListNode middle){
//        ListNode prev = null;
//        ListNode current = middle;
//        while(current != null){
//            ListNode nextNode = current.next;
//            current.next  = prev;
//            prev = current;
//            current = nextNode;
//        }
//        return prev;
//    }
//    private ListNode findMiddle(ListNode head){
//        ListNode slow = head;
//        ListNode fast = head;
//        while(fast != null && fast.next != null ){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }

}
