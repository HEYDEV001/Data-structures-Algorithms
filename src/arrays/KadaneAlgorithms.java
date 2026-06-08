package arrays;

public class KadaneAlgorithms {
    public static void main(String[] args) {
        int[] arr = { -1, -2, -6, -3, 10 };
        System.out.println(kadaneAlgo(arr));
    }
    public static int kadaneAlgo(int[] arr ){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int kadaneIterator: arr){
            currSum = Math.max(currSum + kadaneIterator, kadaneIterator);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;

    }
    /*
    Kadane's ALGO :
    Iterate over an array and at every index check whether the previous sub array's currSum + nextElement is greater or the nextElement is greater
    Insert the max out of these two into the current sum
    then compare that with max sum
     */
}
