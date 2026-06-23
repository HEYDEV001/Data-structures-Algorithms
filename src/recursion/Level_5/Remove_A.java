package recursion.Level_5;

public class Remove_A {
    public static void main(String[] args) {
//remove("","abajahanamahagayataraa");
        System.out.println(remove1("abajahanamahagayataraa"));
    }
     static void remove(String pro, String noob) {
        if(noob.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = noob.charAt(0);
        if(ch=='a'){
            remove(pro,noob.substring(1));
            // Here we have created a substring which is updated in the noob so the indexing starts from 0 again and again
        }
        else{
            remove(pro+ch,noob.substring(1));
        }
    }

    // This is the second way
    static String remove1( String str) {
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            return remove1(str.substring(1));
            // Here we have created a substring which is updated in the noob so the indexing starts from 0 again and again
        }
        else{
            return ch + remove1(str.substring(1));
        }
    }
}
