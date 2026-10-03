package GreedyAlgo.Questions;

import java.util.Arrays;

public class AssignMiceHoles {
    public static void main(String[] args) {

    }
    public int assignHole(int[] mice, int[] holes) {
        int n = mice.length;
        Arrays.sort(mice);
        Arrays.sort(holes);
        int maxTime = 0;
        for(int i =0 ; i < n ;i++){
            maxTime = Math.max(maxTime, Math.abs(mice[i]-holes[i]));
        }
        return maxTime;
    }
}
