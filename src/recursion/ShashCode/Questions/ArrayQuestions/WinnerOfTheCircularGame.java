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

    // Solution Using Queue
    public int findTheWinnerUsingQueue(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=n;i++ ){
            queue.add(i);
        }
        while(queue.size()>1){
            for(int i = 0 ; i < k-1 ; i++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }


    // Using Recursion
    public int findTheWinnerUsingRecursion(int n, int k) {
        int index = helper(n, k);
        return index +1;
    }
    public int helper(int n , int k ){
        if(n==1){
            return 0;
        }
        return (helper(n-1, k) + k)% n;
    }


    // Best approach constructing the answer bottom up
    public int findTheWinnerBest(int n, int k) {
        int ans =0;
        for(int i =2; i<=n; i++){
            ans = (ans + k) % i;
        }
        return ans+1;
    }
}
