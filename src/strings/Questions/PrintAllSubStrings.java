package strings.Questions;

import java.util.ArrayList;

public class PrintAllSubStrings {
    public static void main(String[] args) {
        System.out.println(printAllSubStrings("abc"));

    }
    public static ArrayList<String> printAllSubStrings(String s) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            for(int j = i+1; j <= s.length(); j++) {
                list.add(s.substring(i, j));
                System.out.println(s.substring(i, j));
            }
        }
        return list;
    }
}
