package GreedyAlgo.Questions;

public class JumpGame2 {
    public static void main(String[] args) {

    }
    public int jump(int[] nums) {
        int n = nums.length;
        int maxIndex = 0;
        int end =0;
        int count =0;
        for(int i = 0 ; i < n -1; i++){
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if(i == end) {
                count++;
                end = maxIndex;
            }
            if(end == n-1){
                break;
            }
        }
        return count;
    }
}
