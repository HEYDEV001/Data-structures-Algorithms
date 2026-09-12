package recursion.ShashCode.Questions.ArrayQuestions;

public class FindTheLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 6, 7, 2, 9, 10};
        System.out.println(findTheLastOccurrence(arr, 20, arr.length - 1));
        System.out.println(findTheLastOccurrence2(arr, 2, 0));

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

    public static int findTheLastOccurrence2(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
       int res  = findTheLastOccurrence2(arr, target, index+1);
        if(res == -1){
            if(arr[index] == target){
                return index;
            }
        }
        return res;
    }
}
