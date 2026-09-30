package GreedyAlgo.Questions;

import java.util.Arrays;

public class NonOverLappingIntervals {
    public static void main(String[] args) {

        int[][]  intervals = new int[][]{{1,2},{2,3},{3,4}, {1, 3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) ->a[1] - b[1]);
        int removed = 0;
        int lastIndex = intervals[0][1];
        for(int i = 1 ; i < n ; i++){
            if(intervals[i][0] >= lastIndex){
                lastIndex = intervals[i][1];
            }else{
                removed++;
            }
        }
        return removed;
    }
}
