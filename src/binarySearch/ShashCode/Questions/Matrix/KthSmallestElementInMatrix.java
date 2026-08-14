package binarySearch.ShashCode.Questions.Matrix;

public class KthSmallestElementInMatrix {
    public static void main(String[] args) {
        int [][] mat = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}};
        System.out.println(kthSmallest(mat,8));
    }
    public static int kthSmallest(int[][] matrix, int k) {
        int elementsSmallerThanTheExpectedElement = k-1;
        int size = matrix.length;
        int start = matrix[0][0];
        int end = matrix[size-1][size-1];
        while(start<=end){
            int mid = start+((end-start)/2);
            int totalSmallerElements = 0;
            totalSmallerElements = getSmallerElement(matrix, mid);
            if(totalSmallerElements > elementsSmallerThanTheExpectedElement){
                end  = mid -1;
            }else{
                start  = mid+1;
            }
        }
        return start;
    }

    public static int getSmallerElement(int[][] matrix, int expectedElement){
        int result = 0;
        for(int i=0 ; i<matrix.length;i++){
            int start = 0;
            int end = matrix[i].length-1;
            while(start<=end){
                int mid = start + ((end-start)/2);
                if(expectedElement >= matrix[i][mid]){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }
            result += start;
        }
        return result;
    }
}
