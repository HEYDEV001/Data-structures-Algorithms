package binarySearch.ShashCode.Questions.Matrix;

public class MedianOfSortedMatrix {
    public static void main(String[] args) {
        int [][] mat = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        System.out.println(median(mat));
    }
    public static int median(int[][] mat) {
        int N = mat.length * mat[0].length;
        int start = 1;
        int end = 2000;
        int medianIndex = N/2;
        while(start<= end){
            int mid = start + ((end -start)/2);
            int minimumIndexes = 0;
            minimumIndexes = getMinimumIndexes(mat, mid);
            if(minimumIndexes > medianIndex){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return start;

    }

    public static int getMinimumIndexes(int[][] matrix, int expectedMedian){
        int result =0;
        for(int  i=0;i<matrix.length;i++){
            int start =0;
            int end = matrix[i].length-1;
            while(start<=end){
                int mid = start+((end - start)/2);
                if(expectedMedian>= matrix[i][mid]){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }
            result +=start;
        }
        return result;
    }
}
