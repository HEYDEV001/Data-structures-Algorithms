package strings.extra;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        StringBuilder str = new StringBuilder();

        str.append("hello");
        System.out.println(str);
        str.append("world");
        System.out.println(str);




        String str1 = new String();
//        str1 = "Hello";
//        System.out.println(str1);
//        str1 = "jhdva";
//        System.out.println(str1);
//        str1.

        for(int i = 0 ; i <26 ; i++){
            char ch = (char)('a'+i);
            //  System.out.println(ch);
            builder.append(ch);
        }

        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        builder.deleteCharAt(25);
        System.out.println(builder);
    }
}
