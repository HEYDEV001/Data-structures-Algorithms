package GreedyAlgo.Questions;

public class PoliceAndThieves {
    public static void main(String[] args) {

    }

    public int catchThieves(char[] arr, int k) {
        // code here
        int n = arr.length;
        int i = -1 ;
        int j = -1 ;
        for(int m  =0 ; m < n ; m++){
            if(i==-1 && arr[m] == 'P') i=m;
            if(j==-1 && arr[m] == 'T') j=m;
            if(i!= -1 && j != -1) break;
        }
        int caught =0 ;
        while(i < n  && j < n ){
            if(Math.abs(i-j) <=k){
                caught++;
                i++;
                while (i < n && arr[i] != 'P') i++;
                j++;
                while(j < n && arr[j] !='T') j++;
            }else if(i < j){
                while(i < n && arr[i] != 'P') i++;
            }else{
                while(j < n && arr[j] !='T') j++;
            }
        }
        return caught;
    }
}
