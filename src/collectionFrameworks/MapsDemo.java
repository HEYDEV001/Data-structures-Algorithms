package collectionFrameworks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {
    public static void main(String[] args) {

        // HashMap -> Follows no order
        System.out.println("HashMap......");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "dev");
        map.put(11, "rishi");
        map.put(111, "yuvraj");
        map.put(1111, "shubhi");
        map.put(11111, "Aradhya");

       for(Map.Entry<Integer, String> entry : map.entrySet()) {
           System.out.println(entry.getKey() + " -> " + entry.getValue());
       }
        map.put(11,"Rishi Gupta");
       map.put(100, map.getOrDefault(100, "Billu")+" pathak");

       // print Using keys
        System.out.println("print using keys....");
        for(Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        // Print Using Values
        System.out.println("print using values....");
        for(String vals : map.values()) {
            System.out.println(vals);
        }

        System.out.println(map.containsKey(18));
        System.out.println(map.containsValue("one"));


        // Linked HashMap -> Follows Insertion Order
        System.out.println("linkedHashMap......");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "dev");
        linkedHashMap.put(11, "rishi");
        linkedHashMap.put(111, "yuvraj");
        linkedHashMap.put(1111, "shubhi");
        linkedHashMap.put(11111, "Aradhya");

        for(Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        linkedHashMap.put(11,"Rishi Gupta");
        linkedHashMap.put(100, linkedHashMap.getOrDefault(100, "Billu")+" pathak");

        // print Using keys
        System.out.println("print using keys....");
        for(Integer key : linkedHashMap.keySet()) {
            System.out.println(key + " -> " + linkedHashMap.get(key));
        }
        // Print Using Values
        System.out.println("print using values....");
        for(String vals : linkedHashMap.values()) {
            System.out.println(vals);
        }

        System.out.println(linkedHashMap.containsKey(18));
        System.out.println(linkedHashMap.containsValue("one"));



        // Tree Map -> Increasing Order of keys by default

        System.out.println("TreeMap......");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "dev");
        treeMap.put(11, "rishi");
        treeMap.put(111, "yuvraj");
        treeMap.put(1111, "shubhi");
        treeMap.put(11111, "Aradhya");

        for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        treeMap.put(11,"Rishi Gupta");
        treeMap.put(100, treeMap.getOrDefault(100, "Billu")+" pathak");

        // print Using keys
        System.out.println("print using keys....");
        for(Integer key : treeMap.keySet()) {
            System.out.println(key + " -> " + treeMap.get(key));
        }
        // Print Using Values
        System.out.println("print using values....");
        for(String vals : treeMap.values()) {
            System.out.println(vals);
        }

        System.out.println(treeMap.containsKey(18));
        System.out.println(treeMap.containsValue("one"));

    }



}
