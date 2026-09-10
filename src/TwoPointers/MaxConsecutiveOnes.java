package TwoPointers;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr ={1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int i =0;
        int count =0;
        int currCount  =0;
        while(i < nums.length){
            if(nums[i] != 1){
                count = Math.max(count,currCount);
                currCount  =0;
            }else{
                currCount++;
            }
            i++;
        }
        count = Math.max(count,currCount);
        return count;
    }
}
