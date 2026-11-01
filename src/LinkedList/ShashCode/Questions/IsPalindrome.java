package LinkedList.ShashCode.Questions;

public class IsPalindrome {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode prev = null;
        ListNode fast = head;
        ListNode newListHead = null;
        while(fast != null && fast.next!= null){
            prev = slow ;
            slow = slow .next ;
            fast = fast.next.next;
            if(newListHead == null){
                newListHead = new ListNode(prev.val);
            }else{
                ListNode node = new ListNode(prev.val);
                node.next = newListHead;
                newListHead = node;
            }
        }

        if(fast != null){
            slow = slow.next;
        }
        while(slow != null && newListHead != null){
            if(slow.val != newListHead.val){
                return false;
            }
            slow = slow.next;
            newListHead = newListHead.next;
        }
        return true;
    }
}
