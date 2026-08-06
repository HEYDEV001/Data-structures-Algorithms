package binarySearch.ShashCode.Questions;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int start =0;
        int end  = nums1.length;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int N = n1+n2;
        while(start<=end){
            int cutOnSmallerArray = start + ((end-start)/2);
            int cutOnOtherArray = N/2 - cutOnSmallerArray;

            int left1 = cutOnSmallerArray == 0 ? Integer.MIN_VALUE : nums1[cutOnSmallerArray -1];
            int left2 = cutOnOtherArray == 0 ? Integer.MIN_VALUE : nums2[cutOnOtherArray -1];
            int right1 = cutOnSmallerArray == nums1.length ? Integer.MAX_VALUE : nums1[cutOnSmallerArray];
            int right2 = cutOnOtherArray == nums2.length ? Integer.MAX_VALUE : nums2[cutOnOtherArray];

            if(left1 <= right2 && left2 <= right1){
                if(N%2 == 0){
                    return ((Math.max(left1, left2) + Math.min(right1, right2))/2.0);
                }else{
                    return Math.min(right1, right2);
                }
            }else if(left1 > right2){
                end = cutOnSmallerArray -1;
            }else{
                start = cutOnSmallerArray + 1;
            }
        }
        return 1.0;
    }
}

