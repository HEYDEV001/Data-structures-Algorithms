package recursion.ShashCode.Questions.ArrayQuestions;

public class PrintAllOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 6, 7, 2, 9, 10};
        printAllOccurrences(arr, 0, 2);

    }

    public static void printAllOccurrences(int[] arr, int index, int target) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            System.out.print(index + " ");
        }
        printAllOccurrences(arr, index + 1, target);
    }
}
