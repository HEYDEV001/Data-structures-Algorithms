package recursion.Level_4;

import java.util.Arrays;

public class MSinplace {
    public static void main(String[] args) {
        int[]arr = {6, 5, 4, 3, 2, 1};
         ms(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void ms(int[]arr , int s, int e){
        if(e-s==1){
            return ;
        }
        int mid  = (s+e)/2;
        ms(arr,0,mid);
        ms(arr,mid,e);
        merge(arr,s,mid,e);
    }
    static void merge(int[]arr , int s , int mid , int e){
        int[]mix = new int[e-s];
        int i =s ;
        int j=mid ;
        int  k =0 ;
        // yha agar first array ka element chota h to pehle aayega mix bale or i++ ho jaayega nhi to second bale ka element aayega or j++ ho jaayega
        while(i < mid && j < e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            if (arr[i] > arr[j]){
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // yha agar ek array ki length complete ho jaayegi to doosre arry ke saare element mix bale array me aa jayege
        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l =0 ; l<mix.length ; l++){
            arr[s+l] = mix[l];
        }
    }
    }

