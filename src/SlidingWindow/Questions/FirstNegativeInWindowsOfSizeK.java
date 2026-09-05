package SlidingWindow.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInWindowsOfSizeK {
    public static void main(String[] args) {
        int [] arr = {-8, 2, 3, -6, 10};
        System.out.println(firstNegInt(arr, 2));

    }
    public  static List<Integer> firstNegInt(int arr[], int k) {
        int n = arr.length;
        // code here
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<k;i++) {
            if(arr[i]<0) {
                queue.offer(arr[i]);
            }
        }
        res.add(queue.isEmpty() ? 0 : queue.peek() );
        for(int i = 1;i < n-k +1; i++ ){
            int previousElement = arr[i-1];
            int nextElement = arr[i+k-1];
            if(previousElement<0) {
                queue.poll();
            }
            if(nextElement<0){
                queue.offer(nextElement);
            }
            res.add(queue.isEmpty() ? 0 : queue.peek() );
        }
        return res;
    }
}
