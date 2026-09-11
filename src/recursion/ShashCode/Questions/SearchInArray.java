package recursion.ShashCode.Questions;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(searchInArray(arr, 90, 0));

    }
    public static boolean searchInArray(int[] arr, int target, int i) {
        if(arr[i]==target){
            return true;
        }else if(i==arr.length-1){
            return false;
        }
        return searchInArray(arr,target,i+1);
    }
}
