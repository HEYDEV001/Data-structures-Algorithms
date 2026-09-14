package recursion.ShashCode.Questions.ArrayQuestions;
import java.util.*;

public class WinnerOfTheCircularGame {
    public static void main(String[] args) {
        System.out.println(findTheWinner(6,5));

    }
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> list  = new ArrayList<>();
        for(int i  =1;i<=n;i++ ){
            list.add(i);
        }
        int index=0;
        while(list.size()>1){
            index = (index + k-1) % list.size();
            list.remove(index);
        }
        return list.getFirst();
    }
}
