package binarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
int [][] arr =  {
        {1,2,3},
        {4,5,6},
        {7,8,9}
};
        System.out.println(Arrays.toString(search(arr,6)));
    }
    static int[] search2(int[][]matrix , int row, int cstart, int cend , int target){
        while (cstart <= cend){
            int mid  = cstart + (cend-cstart)/2;
            if (matrix[row][mid]< target){
                cstart = mid + 1;
            }
            if (matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            else{
                cend = mid -1;
            }
        }return new int[]{-1,-1};
    }
    static int[] search (int[][]matrix ,int target )
    {
        int rows = matrix.length ;
        int cols = matrix[0].length;
        if (rows == 1){
            return search2(matrix,0,0,cols-1,target);
        }
        // run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows-1;
        int cmid = cols/2;
        while (rStart <= (rEnd-1)){// While this is true it will have more than two rows
            int mid = rStart + (rEnd-rStart)/2;
        if ( matrix[mid][cmid] == target){
            return new int [] {mid,cmid};
        }
        if ( matrix[mid][cmid] < target){
            rStart = mid;
        }
        else {
            rEnd = mid;
        }
    }
        // now we have two rows
        if (matrix[rStart][cmid]== target) {
            return new int [] {rStart,cmid};
        }
        if (matrix[rStart+1][cmid]== target) {
            return new int [] {rStart+1,cmid};
        }
        //search in first half
        if (target <= matrix[rStart][cmid-1]) {
            return search2(matrix,rStart,0,cmid-1,target);
        }
        //search in second half
        if (target >= matrix[rStart][cmid+1]&& target <= matrix[rStart][cols-1]) {
            return search2(matrix,rStart,cmid+1,cols-1,target);
        }
        //search in third half
        if (target <= matrix[rStart+1][cmid-1]) {
            return search2(matrix,rStart+1,0,cmid-1,target);
        }
        //search in fourth half
        else{
            return search2(matrix,rStart+1,cmid+1,cols-1,target);
        }
    }
}
