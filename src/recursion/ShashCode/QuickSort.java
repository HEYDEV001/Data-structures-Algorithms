package recursion.ShashCode;

public class QuickSort {
    public static void main(String[] args) {

    }
    public static void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>=high){
            return;
        }
        int partitionIndex = partition(arr, low, high) ;
        quickSort( arr,  low,  partitionIndex-1);
        quickSort( arr,  partitionIndex+1,  high);

    }

    private static int partition(int[] arr, int low, int high) {
        // code here
        int pivot = arr[low];
        int i = low;
        int j  = high;
        while(i < j){
            while(arr[i] <= pivot && i < high) i++;
            while(arr[j] > pivot && j > low) j--;

            if(i < j){
                swap(arr, i , j);
            }
        }
        swap(arr, low, j);
        return j;
    }
    private static void swap(int[] arr, int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
