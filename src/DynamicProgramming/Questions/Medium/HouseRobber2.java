package DynamicProgramming.Questions.Medium;

public class HouseRobber2 {
    public static void main(String[] args) {

    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n ==1){
            return nums[0];
        }
        int[] nums1 = new int[n-1];
        int[] nums2 = new int[n-1];
        int j =0;
        int k =0;
        for(int i = 0;i<n ; i++){
            if(i!=0){
                nums1[j] = nums[i];
                j++;
            }
            if(i!=(n-1)){
                nums2[k] = nums[i];
                k++;
            }
        }

        return Math.max(robbed(nums1), robbed(nums2));

    }

    public int robbed(int[] nums) {
        int n = nums.length-1;
        if(n == 0){
            return nums[0];
        }
        if(n == -1){
            return 0;
        }
        int previous = nums[0];
        int beforePrevious  = 0;
        int ans = 0;
        for(int state =2; state<=n+1 ; state++){
            int pick = nums[state-1] + beforePrevious;
            int noPick = previous;
            ans = Math.max(pick , noPick);
            beforePrevious = previous;
            previous  = ans ;

        }
        return ans;
    }
}
