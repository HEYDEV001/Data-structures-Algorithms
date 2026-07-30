package binarySearch.ShashCode.Questions.BitonicArray;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
// peak Index In Mountain Array
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
