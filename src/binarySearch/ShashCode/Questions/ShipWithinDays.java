package binarySearch.ShashCode.Questions;

public class ShipWithinDays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,1};
        System.out.println(shipWithinDays(arr, 4));

    }
    public static int shipWithinDays(int[] weights, int days) {
        int start =Integer.MIN_VALUE;
        int end =0;
        for(int w : weights){
            start = Math.max(start, w);
            end +=w;
        }
        int ans =-1;
        while(start <= end){
            int mid = start +((end-start)/2);
            if(isShippingPossible(weights, mid, days)){
                ans = mid;
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return ans;
    }
    public static boolean isShippingPossible(int[] arr, int minimumWeight, int totalDays){
        int days =1;
        int totalWeight =0;
        for(int w : arr){
            totalWeight+=w;
            if(totalWeight>minimumWeight){
                totalWeight = w;
                days++;
            }if(days>totalDays){
                return false;
            }
        }
        return true;
    }
}
