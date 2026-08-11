package SortingAlgos;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int [] arr  = {2, 34,5 ,3, 12,1 ,435 ,6 ,87};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }
    public  static int[] cycleSort(int[]arr){
        int n  = arr.length;
       for (int cycle =0; cycle < n-1; cycle++){
           int element = arr[cycle];
           int pos = cycle;

           for(int i = cycle+1; i < n; i++){
               if(element > arr[i]){
                    pos++;
               }
           }
           if(pos == cycle){
               continue;
           }
           while(element==arr[pos]){
               pos++;
           }

           if(pos != cycle){
           int temp = arr[pos];
           arr[pos] = element;
           element =temp;
           }

           while(pos!=cycle){
               pos= cycle;

               for(int i = cycle+1; i < n; i++){

                   if(element > arr[i]){
                       pos++;
                   }
               }
               while(element==arr[pos]){
                   pos++;
               }
               int temp = arr[pos];
               arr[pos] = element;
               element =temp;
           }

       }
       return arr;
    }
}
