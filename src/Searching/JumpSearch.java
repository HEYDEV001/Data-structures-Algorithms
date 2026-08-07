package Searching;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = {1,2 ,3 ,4 ,5 ,6, 7, 8,9,10, 11, 12, 13, 14, 15, 16};
        System.out.println(jump(arr, 10));

    }
    public static int jump(int[] arr, int target){
        int start = 0 ;
        int blockSize =(int) Math.sqrt(arr.length);
        int end = blockSize;
        while(end < arr.length && target >= arr[end]){
            start = end;
            end +=blockSize;
            if(end > arr.length){
                end  = arr.length;
            }
        }
        for(int i = start ; i<end;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
