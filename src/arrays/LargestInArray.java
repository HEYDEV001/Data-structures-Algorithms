package arrays;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        MaxAndIndex maxAndIndex = largestInArray(arr);
        System.out.println(maxAndIndex);

    }
    public static MaxAndIndex largestInArray(int[] nums) {
        int max = 0 ;
        int index = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
                index = i ;
            }
        }
        return new MaxAndIndex(max, index);

    }
    public static class MaxAndIndex{
        @Override
        public String toString() {
            return "maxAndIndex { " +
                    "max = " + max +
                    ", index = " + index +
                    " }";
        }

        public MaxAndIndex(int max, int index) {
            this.max = max;
            this.index = index;
        }

        int max;
        int index;
    }
}
