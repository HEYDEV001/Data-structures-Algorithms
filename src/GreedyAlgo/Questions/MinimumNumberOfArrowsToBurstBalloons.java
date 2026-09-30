package GreedyAlgo.Questions;

import java.util.Arrays;

public class MinimumNumberOfArrowsToBurstBalloons {
    public static void main(String[] args) {

    }
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points,(a, b) -> a[1] <= b[1] ? -1 : 1 );
        int arrows = 1;
        int lastIndex = points[0][1];
        for(int point[]: points){
            if(point[0] > lastIndex){
                arrows++;
                lastIndex = point[1];
            }
        }
        return arrows;
    }
}
