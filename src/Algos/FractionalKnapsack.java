package Algos;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W=50;

        double [][] ratio = new double[values.length][2];
        for (int i = 0; i < values.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = values[i]/(double)weights[i];
        }
        Arrays.sort(ratio, Comparator.comparing(o->o[1]));
        int capacity=W;
        int total=0;
        for(int i = ratio.length-1; i>=0; i--) {
            int index = (int)ratio[i][0];
            if(capacity > weights[index]){
                total+=values[index];// Include full Item
                capacity-=weights[index];
            }else{
                //Include fractional Item
                total+= (int) (ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("Final Value : " + total);


    }
}
