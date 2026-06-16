package recursion;

public class Occurrence {
    public static void main(String[] args) {
        int[]arr = {1,2,3,6,5,6,6, 6, 6, 6, 7, 7,8,9};
        System.out.println(findFirstOccurrence(arr, 6, 0));
        System.out.println(lastOccurrence(arr, 7, 0, 0));
        System.out.println(lastOccurrenceBetter(arr, 6, arr.length-1));

    }
    public static int findFirstOccurrence(int[] arr, int target, int index) {
        if(arr == null || arr.length == 0 || index == arr.length) return -1;
        if(arr.length == 1) return 0;
        if(arr[index] == target) return index;
        return findFirstOccurrence(arr, target , index+1);
    }


    public static int lastOccurrence(int[] arr, int target, int index, int lastOccurrence) {
        if(arr == null || arr.length == 0 ) return -1;
        if(arr.length == 1) return 0;
        if(arr[index] == target){
            lastOccurrence = index;
        }
        if(index == arr.length-1) return lastOccurrence;
        return lastOccurrence(arr, target , index+1, lastOccurrence);
    }
    public static int lastOccurrenceBetter(int[] arr, int target, int index) {
        if(arr == null || arr.length == 0 ) return -1;
        if(arr.length == 1) return 0;
        if(arr[index] == target){
            return index;
        }
        return lastOccurrenceBetter(arr, target , index-1);
    }
}
