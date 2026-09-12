package recursion.ShashCode.Questions.ArrayQuestions;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(searchInArray(arr, 10, 0));

    }
    public static boolean searchInArray(int[] arr, int target, int i) {
        if(i==arr.length){
            return false;
        } else if(arr[i]==target){
            return true;
        }
        return searchInArray(arr,target,i+1);
    }
}
