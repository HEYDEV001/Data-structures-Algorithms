package SortingAlgos;

public class MergeSort {
    public static void main(String[] args) {

    }
    public static void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return;

        }
        int mid = l + (r-l)/2;
        mergeSort( arr, l,  mid);
        mergeSort( arr, mid +1,  r);

        merge(arr, mid,l ,r);
    }
    private static void merge(int[] arr, int mid, int l, int r){
        // Length of left part of the array
        int n1 = mid - l + 1;
        int n2 =  r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1; i++){
            left[i] = arr[l+i];
        }
        for(int i = 0; i < n2; i++){
            right[i] = arr[mid+1+i];
        }

        int leftIndex =0;
        int rightIndex = 0;
        int k = l;
        while(leftIndex < left.length && rightIndex< right.length){
            if(left[leftIndex] < right[rightIndex]){
                arr[k] = left[leftIndex];
                leftIndex++;
            }else{
                arr[k] = right[rightIndex];
                rightIndex++;
            }
            k++;
        }
        while(leftIndex < left.length){
            arr[k] = left[leftIndex];
            leftIndex++;
            k++;
        }
        while(rightIndex < right.length){
            arr[k] = right[rightIndex];
            rightIndex++;
            k++;
        }

    }
}
