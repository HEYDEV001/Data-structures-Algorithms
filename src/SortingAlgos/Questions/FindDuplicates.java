package SortingAlgos.Questions;

public class FindDuplicates {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] arr) {
        int i  =0 ;
        int n = arr.length;
        while(i < n){
            int correct  = arr[i]-1;
            if(arr[i] == arr[correct]){
                i++;
            }else{
                swap(arr, i, correct);
            }
        }
        for(int j =0; j<n;j++){
            if(arr[j]!= j+1){
                return arr[j];
            }
        }
        return -1;
    }
    public void swap(int[]arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
