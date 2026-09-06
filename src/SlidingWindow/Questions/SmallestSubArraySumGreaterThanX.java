package SlidingWindow.Questions;

public class SmallestSubArraySumGreaterThanX {
    public static void main(String[] args) {
        int [] arr = {1, 4, 45, 6, 0, 19};
        System.out.println(smallestSubWithSum(51, arr));

    }
    public static int smallestSubWithSum(int x, int[] arr) {
        int smallestLength = Integer.MAX_VALUE;
        int sum =0;
        int windowStart = 0;
        int windowEnd =0;
        int currLength =0;

        while(windowEnd < arr.length){
            sum+=arr[windowEnd];
            if(sum > x){
                currLength = windowEnd-windowStart+1;
                smallestLength = Math.min(smallestLength, currLength);
                while(windowEnd > windowStart && sum > x ){
                    sum -= arr[windowStart];
                    windowStart++;
                    if(sum > x){
                        currLength = windowEnd-windowStart+1;
                        smallestLength = Math.min(smallestLength, currLength);
                    }
                }
            }
            windowEnd++;
        }

        return (smallestLength== Integer.MAX_VALUE) ? 0 : smallestLength;
    }
}
