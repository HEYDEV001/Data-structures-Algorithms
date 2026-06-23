package recursion.Level_5;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
//        subseq("","abc");
       // System.out.println(subseqRet("","abc"));
        subseq2("","abc");
//        System.out.println(subseqRet2("","abc"));
    }

    /*
    This pattern of taking some elements and removing some is known as subset pattern
     */
    static void subseq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch =  up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));

    }
    static ArrayList<String> subseqRet(String p , String up){
        if (up.isEmpty()) {
            // here i am creating a new arraylist and whenever the up is empty add the p in the list and return it
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        // here we are creating two list left(it takes the element ) and right(it ignores the element ) and adding these two lists by .addall method and just returning the list
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));
        left.addAll(right);
        return left;

    }
    // This also prints with ASCII values
    static void subseq2(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch =  up.charAt(0);
        subseq2(p+ch,up.substring(1));
        subseq2(p+(ch+0),up.substring(1));
        subseq2(p,up.substring(1));

    }

    // This also return with ASCII values


    static ArrayList<String> subseqRet2(String p , String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet2(p + ch, up.substring(1));
        ArrayList<String> Mid = subseqRet2(p+(ch+0), up.substring(1));
        ArrayList<String> right = subseqRet2(p, up.substring(1));
        left.addAll(right);
        left.addAll(Mid);
        // Here left will contain all the elements form right and Mid
        return left;

    }
}
