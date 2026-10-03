package GreedyAlgo.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencing {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        int maxDeadline = 0;
        for (int d : deadline) {
            maxDeadline = Math.max(d, maxDeadline);
        }

        Integer[] result = new Integer[maxDeadline + 1];
        Arrays.fill(result, -1);

        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        Arrays.sort(index, (a, b) -> profit[b] - profit[a]);
        int count = 0;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            int idx = index[i];
            int d = deadline[idx];
            while (d > 0 && result[d] != -1) {
                d--;
            }
            if (d == 0) {
                continue;
            }
            result[d] = profit[idx];
            count++;
            maxProfit += profit[idx];
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(count);
        res.add(maxProfit);
        return res;
    }
}
