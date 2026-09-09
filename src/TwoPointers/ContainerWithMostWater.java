package TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {

    }
    public static int maxWater(int [] height){
        int i =0;
        int j=height.length-1;
        int ans = 0;
        while(i<j){
            int length = j - i;
            int minHeight = Math.min(height[i],height[j]);
            int volume = length * minHeight;
            ans = Math.max(ans,volume);
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}
