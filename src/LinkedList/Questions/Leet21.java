package LinkedList.Questions;

public class Leet21 {
    public static void main(String[] args) {

    }

    // Ans->
//    public static LinkedListCustom merge(LinkedListCustom l1, LinkedListCustom l2) {
//        LinkedListCustom.Node f = l1.head;
//        LinkedListCustom.Node s = l1.head;
//        LinkedListCustom res = new LinkedListCustom();
//        while (f != null && s != null) {
//            if (f.data < s.data) {
//                res.insertLast(f.data);
//                f = f.next;
//            }
//            else {
//                res.insertLast(s.data);
//                s = s.next;
//            }
//
//        }
//        while (f != null) {
//            res.insertLast(f.data);
//            f = f.next;
//        }
//        while (s != null) {
//            res.insertLast(s.data);
//            s = s.next;
//        }
//        return res;
//    }



    // Submitted at Leetcode
//    public Node mergeTwoLists(Node list1, Node list2) {
//        Node dummyHead  = new Node();
//        Node tail = dummyHead;
//        while(list1 != null && list2 != null){
//            if(list1.val< list2.val){
//                tail.next =list1;
//                list1 =list1.next ;
//                tail = tail.next;
//            }else{
//                tail.next =list2;
//                list2 =list2.next ;
//                tail = tail.next;
//            }
//
//        }
//        while(list1!=null){
//            tail.next =list1;
//            list1 =list1.next ;
//            tail = tail.next;
//        }
//        while(list2!=null){
//            tail.next =list2;
//            list2 =list2.next ;
//            tail = tail.next;
//        }
//        return dummyHead.next;
//
//    }



}
