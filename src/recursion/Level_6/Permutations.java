package recursion.Level_6;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        ArrayList<String> ans = permutations1("","abc");
//        System.out.println(ans);
        System.out.println(permutationCount("","abcdefghijklmnopqrstuvwxyz"));
    }
    static void permutations(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutations(first + ch + second, up.substring(1));
        }
    }




    static ArrayList<String> permutations1(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            ans.addAll(permutations1(first + ch + second, up.substring(1)));
        }
    return ans;}



// this will return the count of permutations

    static int permutationCount(String p, String up) {
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count += permutationCount(first + ch + second, up.substring(1));
        }
        return count;
    }
}
