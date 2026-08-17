package HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashmapIntro {
    static class Registration{
        int regNo;

        public Registration(int regNo) {
            this.regNo = regNo;
        }

        @Override
        public boolean equals(Object o) {
            Registration registration = (Registration) o;
            return this.regNo == registration.regNo;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(regNo);
        }
    }

    static class Ranking{
        int rank;

        public Ranking(int rank) {
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "Ranking{" +
                    "rank=" + rank +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
           Ranking ranking = (Ranking) o;
            return this.rank == ranking.rank;
        }

    }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
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
        // If key-value pair is not present iy will give default message.
        System.out.println(map.getOrDefault(6,"DisPossible"));
        System.out.println(map);
        // This will update the value at 3
        map.put(3, "nana");
        // This will update the value at 6 if 6 is present. If 6 is not present it will add new key-value pair
        System.out.println(map);
        map.put(6, "banana");
        System.out.println(map);
        // This will replace the value at 3
        map.replace(3, "banana 1");
        System.out.println(map);
        // This will update the value at 7, and if 7 is not present it will do nothing.
        map.replace(7, "banana 2");
        System.out.println(map);

        // Iteration On Map via EntrySet
//        for(Map.Entry<Integer, String> entry : map.entrySet()){
//            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
//        }
        // via keySey
//        for(Integer key : map.keySet()){
//            System.out.println("key: " + key + " value: " + map.get(key));
//        }



        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(123, 1);
        map2.put(223, 2);
        map2.put(323, 3);
        map2.put(423, 4);
        System.out.println(map2.get(223));
        System.out.println(map2.containsKey(123));

        // Custom key-value classes
        // When we want the Custom key-value classes then we have to override the equals() and hashcode() method of key's class & toString() method of the value's class
        HashMap<Registration, Ranking> map3 = new HashMap<>();
        map3.put(new Registration(123), new Ranking(1));
        map3.put(new Registration(223), new Ranking(2));
        map3.put(new Registration(323), new Ranking(3));
        map3.put(new Registration(423), new Ranking(4));
        System.out.println(map3.get(new Registration(123)));
        System.out.println(map3.containsKey(new Registration(223)));
    }
}
