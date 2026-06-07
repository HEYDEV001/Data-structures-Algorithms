package arrays;

public class SubArrays {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5};
        subArrays(arr);
    }
    // SubArrays = A Continuous sub part of array
    public static void subArrays(int[] nums) {

        for(int i  =0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                for(int k   = i ; k <=j ; k++){
                    System.out.print(nums[k]);
                }
                System.out.println();
            }
        }
    }

}
