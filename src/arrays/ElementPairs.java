package arrays;


public class ElementPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,7, 8, 9, 10};
        elementPairs(arr);


    }
    public static void elementPairs(int[] arr) {
        // Total number of pairs in an array containing n elements  = (n(n-1))/2 .
        // TC = O(n^2)

        int totalPairs = 0;
        for(int i =0; i <= arr.length-1;i++){
            int curr = arr[i];

            for(int j = i + 1 ; j <= arr.length-1 ; j++){
                totalPairs ++;
                System.out.print("("+curr+","+arr[j]+") ");
            }
            System.out.println();

        }
        System.out.println("Total pairs: "+totalPairs);
    }
}
