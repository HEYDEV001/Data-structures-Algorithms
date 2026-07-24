package binarySearch.ShashCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int target = 5;
        System.out.println(search(arr,target));
        int[] nums =  {15, 14, 13, 12, 11, 10, 9 ,8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(searchDESC(nums, target));

    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }


    public static int searchDESC(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
