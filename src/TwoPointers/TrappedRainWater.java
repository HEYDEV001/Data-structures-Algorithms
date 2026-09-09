package TwoPointers;

public class TrappedRainWater {
    public static void main(String[] args) {

    }
    public static int trap(int[] height) {
        int totalTrappedWater = 0;
        int waterLevel = 0;
        // Calculate left max boundary for every building
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1;i<height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Calculate right max boundary for every building
        int[] rightMax =new int[height.length];
        rightMax[rightMax.length -1] = height[height.length -1];
        for(int j = rightMax.length-2 ; j>=0 ; j--){
            rightMax[j] = Math.max(height[j], rightMax[j+1]);
        }

        for(int i = 0 ;i<height.length ;i++){
            // calculate water level for every building
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            // calculate trapped water on every building and add the trapped water
            totalTrappedWater += waterLevel-height[i];
        }

        return totalTrappedWater;

    }



    public int trapBestApproach(int[] height) {
        int totalTrappedWater = 0;
        int leftMax =0;
        int rightMax =0;
        int n = height.length;
        int l =0;
        int r = n-1;
        while(l<r){
            rightMax = Math.max(rightMax, height[r]);
            leftMax = Math.max(leftMax, height[l]);
            if(leftMax<rightMax){
                totalTrappedWater += leftMax - height[l];
                l++;
            }else{
                totalTrappedWater += rightMax - height[r];
                r--;
            }
        }
        return totalTrappedWater;

    }
}
