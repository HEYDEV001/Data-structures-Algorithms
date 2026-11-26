package LinkedList.ShashCode.Questions;

public class LinkedListGroupReverse {
    public static void main(String[] args) {

    }
//    public Node reverseKGroup(Node head, int k) {
//        // code here
//        Node prevHead = null;
//        Node currentHead = head;
//        Node ansNode = null;
//        int counter = 0;
//        while(currentHead != null){
//            Node prev = null;
//            Node current = currentHead ;
//            Node nextNode = null;
//            int i =0;
//            while(i< k && current != null){
//                nextNode  = current.next;
//                current.next = prev;
//                prev= current;
//                current = nextNode;
//                i++;
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
//    }
}
