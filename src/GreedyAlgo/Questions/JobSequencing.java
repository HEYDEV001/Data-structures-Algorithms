package GreedyAlgo.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencing {
    public static void main(String[] args) {

    }


    // TODO : Do this one again
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        int maxDeadline = 0;

        for (int d : deadline) {
            maxDeadline = Math.max(d, maxDeadline);
        }
        Integer[] result = new Integer[maxDeadline + 1];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        Integer[] index = new Integer[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        Integer[] id = new Integer[n];

        for (int i = 0; i < n; i++) {
            id[i] = i + 1;
        }

        int count = 0;
        int maxProfit = 0;
        Arrays.sort(index, (a, b) -> profit[b] - profit[a]);
        for (int i = 0; i < n; i++) {
            int idx = index[i];
            int d = deadline[idx];
            while (d > 0 && result[d] != -1) {
                d--;
            }
            if (d == 0) {
                continue;
            }
            result[d] = id[idx];
            count++;
            maxProfit += profit[idx];
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(count);
        res.add(maxProfit);
        return res;
    }
}
