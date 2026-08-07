package binarySearch.ShashCode.Questions;

public class CountPerfectSquares {
    public static void main(String[] args) {
        System.out.println(25/13);
    }
    static int countSquares(int n) {
        // code here
        int squareRoot = mySqrt(n);
        return squareRoot-1;

    }
    public static int mySqrt(int n){
        int start =1;
        int end = n;
        while(start<=end){
            int mid  = start + (end-start)/2;
            if(mid <= (n/mid)){
                if(n%mid ==0 && mid == (n/mid)){
                    return mid;
                }
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return start;
    }
}
