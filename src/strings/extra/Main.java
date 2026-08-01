package strings.extra;

public class Main {
    public static void main(String[] args) {
        /*
        Two concept to learn
        1: String pool = String pool is the separate memory structure inside the heap
        2: immutability
         */
//       String a  = "dev";
//        System.out.println(a);
//        a =  "pathak";
//        System.out.println(a);
        /*here we are not changing "dev" we are creating a new object "pathak"
        because in java strings are immutable so every time you assign a new string to "a" it will creat a new object
         */

        String a = "dev";
        String b = "dev";
        System.out.println(a==b);
        String name1 =new String("adarsh");// these are two different objects created although objects are same
        String name2 =new String("adarsh");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));// this checks the value so if the value is same of different objects it will give true
        System.out.println(name1.charAt(3));// this will give me character at 3 index we cannot directly get the character at 3
    }

}
