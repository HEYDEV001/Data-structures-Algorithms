package strings.extra;

public class Performance {
    public static void main(String[] args) {
        String string = " ";
        for(int i = 0 ; i <26 ; i++){
            char ch = (char)('a'+i);
          //  System.out.println(ch);
            string += ch ;
        }
        System.out.println(string);
    }
}
