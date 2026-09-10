package TwoPointers;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

    }
    public static  int removeDuplicates(int[] arr) {
        int i = 0;
        int k =0;
        while(i < arr.length){
            if(arr[i]!= arr[k]){
                k++;
                arr[k] = arr[i];
            }
            i++;
        }
        return k + 1;
    }
}
