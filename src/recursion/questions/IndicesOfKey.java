package recursion.questions;

public class IndicesOfKey {
    public static void main(String[] args) {

        int[] arr = {1, 2, 6, 4, 5, 6, 7, 6, 9, 6};
        findIndices(arr, 6, 0);
    }
    public static void findIndices(int[]arr, int key, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == key){
            System.out.print(index+" ");
        }
        findIndices(arr, key, index+1);
    }
}
