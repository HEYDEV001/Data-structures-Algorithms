package LinkedList.ShashCode.Questions;

public class PairWiseSwap {
    public static void main(String[] args) {

    }
    public Node pairwiseSwap(Node head) {
        // code here
        Node first = head;
        Node prev = null;
        while(first != null && first.next != null){
            Node second = first.next;

            first.next = second.next;
            second.next = first;
            // first Swap (head must be updated)
            if(prev == null){
                head = second;
            }else{
                prev.next = second;
            }
            prev = first;
            first = prev.next;
        }
        return head;
    }
}
