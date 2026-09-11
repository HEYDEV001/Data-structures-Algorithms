package recursion.ShashCode.Questions;

public class FindTheLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findTheLastOccurrence(arr, 2, arr.length - 1));

    }
    public static int findTheLastOccurrence(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findTheLastOccurrence(arr, target, index-1);
    }
}
