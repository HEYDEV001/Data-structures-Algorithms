package recursion.questions;

public class Length {
    public static void main(String[] args) {
        System.out.println(lengthOfTheString("hello", 0));

    }
    public static int lengthOfTheString(String str, int index){
        if(index == str.length()){
            return 0;
        }
        return lengthOfTheString(str,index+1) +1;
    }
}
