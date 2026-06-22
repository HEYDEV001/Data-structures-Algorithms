package recursion.Level_3;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr =  {9,8,7,6,5,4,32};
        sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));

        Sort2(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr, int end , int start, int max){
        if (end == 0) {
            return;
        }
        if(start<end){
            if(arr[start]>arr[max]){
                sort(arr,end,start+1,start);
            }
            else{
                sort(arr,end,start+1,max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[end-1];
            arr[end-1]  =  temp ;
            sort(arr,end - 1, 0,0);
        }
    }






    static void Sort2(int[] arr, int start , int end, int maxi){
        if (end == 0) {
            return;
        }
        if(start<end){
            if(arr[start]>arr[maxi]){
                Sort2(arr,start+1,end,start);
            }
            else{
                Sort2(arr,end,start+1,maxi);
            }
        }
        else{
            // swap with the last element and then decrease the size of the array by 1 so next time it will only check till the second last
            int temp  = arr[maxi];
            arr[maxi] = arr[start];
            arr[start] = temp;
            Sort2(arr,0,end-1,0);
        }
    }
}
// Algo of selection sort:

