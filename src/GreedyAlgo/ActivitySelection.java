package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class ActivitySelection {
    public static void main(String[] args) {

    }
    public int activitySelection(int[] start, int[] end) {
        int n = start.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i  =0 ; i < n ; i++){
            list.add(i);
        }
        Collections.sort(list, (a, b) -> end[a] - end[b]);
        int maxActivity = 1;
        int lastIndex = end[list.getFirst()];
        for(int i = 1; i < n ; i++){
            int index = list.get(i);
            if(lastIndex < start[index]){
                maxActivity++;
                lastIndex = end[index];
            }
        }
        return maxActivity;
    }
}
