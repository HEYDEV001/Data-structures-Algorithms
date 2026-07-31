package Algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy {
    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end  = {2, 4, 6, 7, 9, 9};
        // Already sorted acc to end time.

        // if activities are not sorted then we have to sort
        int[][] activities = new int[start.length][3];
        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparing(o ->o[2]));


        int maxActivity =1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if(activities[i][1] >= lastEnd) {
                maxActivity++;
                lastEnd = activities[i][2];
                list.add(activities[i][0]);
            }
        }
        System.out.println("Max activity: " + maxActivity);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("A"+list.get(i) + " ");
        }

        // This is when time is given in sorted orderz

//        int maxActivity =1;
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(0);
//        int lastEnd = end[0];
//        for (int i = 1; i < end.length; i++) {
//            if(start[i] >= lastEnd) {
//                maxActivity++;
//                lastEnd = end[i];
//                list.add(i);
//            }
//        }
//        System.out.println("Max activity: " + maxActivity);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print("A"+list.get(i) + " ");
//        }
    }
}
