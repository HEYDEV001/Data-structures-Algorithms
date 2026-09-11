package recursion.ShashCode.Questions;

public class FindTheFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findTheFirstOccurrence(arr, 2, 0));
    }
    public static int findTheFirstOccurrence(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findTheFirstOccurrence(arr, target, index+1);
    }
}
