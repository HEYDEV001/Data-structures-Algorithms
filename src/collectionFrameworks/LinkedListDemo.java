package collectionFrameworks;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(3));

        System.out.println(list);
        list.addLast(11);
        list.addLast(111);
        System.out.println(list);
        list.addFirst(0);
        System.out.println(list);

    }
}
