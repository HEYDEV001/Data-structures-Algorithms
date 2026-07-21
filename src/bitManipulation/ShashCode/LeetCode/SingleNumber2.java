package bitManipulation.ShashCode.LeetCode;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,3,3,4,4,4};
        System.out.println(singleNumber(nums));
    }
    public  static int singleNumber(int[] nums) {
        int result =0;
        for(int i  = 0 ; i <32;i++){
            int bitCount =0;
            for(int num : nums){
                if((num & (1<<i)) !=0){
                    bitCount++;
                }
            }
            if(bitCount % 3 != 0){
                result |= (1<<i);
            }
        }
        return result;

    }
}
