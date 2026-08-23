package HashMap.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.remove(1);
        // There is no get operation in Hashset instead of get it has contains
        System.out.println(set.contains(2));
        System.out.println(set.size());
        System.out.println(set);

        // Iteration on Hashset
        for(Integer integer : set){
            // While iterating a set using forEach loop you can not remove its element.
            System.out.println(integer);
        }

        // We will use Iterator for iterating Hashset
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            // You can not add any element via Iterator
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
