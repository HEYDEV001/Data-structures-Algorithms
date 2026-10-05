package GreedyAlgo.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FractionalKnapsack {
    public static void main(String[] args) {
            int[] weights = {10, 20 ,30};
            int[] values = {60, 100 ,120};
        System.out.println(fractionalKnapsack(values, weights, 50));
    }

    public class Item implements Comparable<Item> {
        int wt;
        int val;
        double ratio;
        public Item(int wt, int val) {
            this.wt = wt;
            this.val = val;
            ratio = (double) val /(double)wt;
        }

        @Override
        public int compareTo(Item that) {
            if(this.ratio <= that.ratio) return 1;
            return -1;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        ArrayList<Item> items = new ArrayList<>();
        for(int i = 0; i < val.length; i++) {
            items.add(new Item(wt[i], val[i]));
        }
        Collections.sort(items);
        double maxValue = 0.0;
        for(Item item : items ){
            if(capacity <= item.wt){
                maxValue += item.ratio * capacity;
                capacity = 0;
            }else{
                maxValue += item.val;
                capacity -= item.wt;
            }
            if(capacity ==0 ) break;
        }
        return maxValue;
    }
}
