package recursion.Level_3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
int[]arr =  {9,8,7,6,5,4,32};
bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int last , int index){
        if(last==0){
            return;
        }
        if(arr[index]>arr[index+1]){
            int temp = arr[index];
            arr[index] = arr[index+1];
            arr[index+1]= temp;
            bubble(arr,last,index+1);
        }
        else{
            bubble(arr,last-1,0);
        }
    }
}
