package GreedyAlgo.Questions;

public class JumpGame {
    public static void main(String[] args) {

    }
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxIndex = 0;
        int i =0;
        while(i<=maxIndex){
            maxIndex = Math.max(maxIndex, i + nums[i]);
            i++;
            if(maxIndex >= n-1) return true;
        }
        return false;
    }
}
