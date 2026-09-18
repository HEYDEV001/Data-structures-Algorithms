package SortingAlgos.Questions;

public class CountInversion {
    public static void main(String[] args) {

    }
    public static int inversionCount(int arr[]) {
        // code here
        return mergeSort(arr, 0, arr.length-1);
    }
    public static int mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return 0;
        }
        int mid = l + (r-l)/2;
        int count = 0;
        count +=mergeSort( arr, l,  mid);
        count+=mergeSort( arr, mid +1,  r);
        count+=merge(arr, mid,l ,r);
        return count;
    }
    private static int merge(int[] arr, int mid, int l, int r){
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
        int count = 0;
        while(leftIndex < left.length && rightIndex< right.length){
            if(left[leftIndex] <= right[rightIndex]){
                arr[k] = left[leftIndex];
                leftIndex++;
            }else{
                count +=(n1-leftIndex);
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
        return count;

    }
}
