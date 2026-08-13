package SortingAlgos.Questions;

public class FirstMissingPositive {
    public static void main(String[] args) {

    }
    public static int firstMissingPositive(int[] arr) {
        int index = 0;
        int size = arr.length;
        while(index < size){
            int correctIndex = arr[index]-1;
            if(correctIndex < 0 || correctIndex >=size || arr[index]== arr[correctIndex]){
                index++;
            }else{
                swap(arr, index, correctIndex);
            }
        }
        for(int arrIndex =1; arrIndex<=size;arrIndex++){
            if(arr[arrIndex-1] !=arrIndex  ){
                return arrIndex;
            }
        }
        return size+1;

    }
    private static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
}
