package HashMap;

import java.util.HashMap;

public class CallingScratchHashmap {
    public static void main(String[] args) {
        HashmapScratch<Integer, String> map = new HashmapScratch<Integer, String>();
        // this puts the key-value pair in the map
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        // This gets the value at a key
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        // If key-value pair is not present iy will give null
        System.out.println(map.get(6));
        System.out.println(map.isEmpty());

        System.out.println(map.containsKey(2));
        map.iterate();
        System.out.println(map.containValue("a"));
        System.out.println(map.containValue("z"));

        System.out.println(map.size());
        System.out.println(map.remove(1));
        System.out.println(map.remove(9));
        System.out.println(map.size());
    }
}
