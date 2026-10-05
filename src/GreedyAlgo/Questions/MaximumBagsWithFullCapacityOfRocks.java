package GreedyAlgo.Questions;

import java.util.Arrays;

public class MaximumBagsWithFullCapacityOfRocks {
    public static void main(String[] args) {

    }
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] diff  = new int[rocks.length];
        for(int i =0 ; i < rocks.length ; i++){
            diff[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(diff);
        int count = 0;
        for(int i : diff){
            if(i==0){
                count++;
            }else{
                if(additionalRocks ==0  || additionalRocks<i){
                    break;
                }else{
                    additionalRocks -= i;
                    count++;
                }
            }
        }
        return count ;

    }
}
