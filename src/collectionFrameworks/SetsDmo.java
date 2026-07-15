package collectionFrameworks;

import java.util.*;
public class SetsDmo {
    public static void main(String[] args) {
        // HastSet -> No Order
        System.out.println("HashSet.....");
        Set<Integer> set  = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(3);
        set.add(4);
        System.out.println(set);

        set.remove(3);
        System.out.println(set);
        System.out.println(set.contains(5));

        // Linked HashSet -> Follows Insertion order

        System.out.println("Linked HashSet.....");
        Set<Integer> linkedHashSet  = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(5);

        System.out.println(linkedHashSet);

        linkedHashSet.remove(3);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains(5));


        // TreeSet or SortedSet -> Follows Sorted Increasing Order by default

        System.out.println("TreeSet.....");
//        Set<Integer> treeSet  = new TreeSet<>(); // Increasing Order
        Set<Integer> treeSet  = new TreeSet<>((a, b) -> b-a); // Decreasing Order

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(5);

        System.out.println(treeSet);

        treeSet.remove(3);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(5));
    }
}
