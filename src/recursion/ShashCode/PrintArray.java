package recursion.ShashCode;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print(arr, 0);
        System.out.println();
        printReverse(arr, arr.length -1);
        System.out.println();
        printReverse2(arr, 0);

    }
    public static void print(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        print(arr, i + 1);
    }

    public static void printReverse(int[] arr, int start) {
        if(start==-1){
            return;
        }
        System.out.print(arr[start] +" ");
        printReverse(arr, start -1);
    }
    public static void printReverse2(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        printReverse2(arr, i + 1);
        System.out.print(arr[i] + " ");
    }

}
