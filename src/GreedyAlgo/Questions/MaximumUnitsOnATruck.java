package GreedyAlgo.Questions;

import java.util.Arrays;

public class MaximumUnitsOnATruck {
    public static void main(String[] args) {

    }
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b)-> b[1]- a[1]);
        int res = 0;
        for(int i = 0 ;i < boxTypes.length; i++){
            if(truckSize <= boxTypes[i][0]){
                res += truckSize * boxTypes[i][1];
                truckSize =0;
            }else{
                res += boxTypes[i][0] * boxTypes[i][1];
                truckSize -=boxTypes[i][0];
            }if(truckSize ==0) break;
        }
        return res;
    }
}
