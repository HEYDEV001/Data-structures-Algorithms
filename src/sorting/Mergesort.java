package sorting;

import java.util.Arrays;
// The time complexity is O(NlogN)
public class Mergesort {
    public static void main(String[] args) {
int[]arr = {6, 5, 4, 3, 2, 1};
arr= mergesort(arr);
System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[]arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        //yha Arrays.copyOfRange ek nayi copy bana rha  h original array ki certain range ki jo ki likhi huyi h
        int []left= mergesort(Arrays.copyOfRange(arr,0,mid));
        int[]right  = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int[]mix = new int[first.length+second.length];
        int i =0 ;
        int j=0 ;
        int  k =0 ;
        // yha agar first array ka element chota h to pehle aayega mix bale or i++ ho jaayega nhi to second bale ka element aayega or j++ ho jaayega
        while(i<first.length &&j< second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            if (first[i] > second[j]){
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // yha agar ek array ki length complete ho jaayegi to doosre arry ke saare element mix bale array me aa jayege
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
