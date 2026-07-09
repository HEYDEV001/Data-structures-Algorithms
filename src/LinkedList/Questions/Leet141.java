package LinkedList.Questions;

//import java.lang.classfile.components.ClassPrinter;

public class Leet141 {
    public static void main(String[] args) {

    }

    // This is the solution using "fast and slow pointer method "

//
//    public boolean hasCycle(Node head) {
//        Node fast = head;
//        Node slow = head;
//        while( fast !=null && fast.next != null ){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast==slow){
//                return true;
//            }
//        }
//        return false;
//    }


    // This calculates the length of the cycle

//    public int hasCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//        while( fast !=null && fast.next != null ){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast==slow){
//                ListNode temp = slow;
//                int lenght=0;
//                do{
//                    temp = temp.next;
//                    lenght++;
//                }while(temp!=slow);
//                    return lenght;
//
//            }
//        }
//        return 0;
//    }


}
