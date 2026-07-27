package binarySearch.ShashCode.Questions.BitonicArray;
// search in rotated sorted array

public class RotatedBinarySearch {
    /*pivot is the element till that ascending order ends and after that elements are arranged in ascending order
    for Example ;
    [3,4,5,6,7,0,1,2] here 7 is the pivot
     */
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,0,1,2};
        System.out.println(findpivot(nums));}
    int target  =1;

        static int search(int[] nums, int target) {

int pivot  = findpivot(nums);
if ( pivot == -1 ){

    return binarysearch(nums,target,0 ,nums.length-1);
}
if (nums[pivot] == target){
    return pivot;
} if (target >=nums[0]){
    return binarysearch(nums,target,0,pivot-1);
            }
    return binarysearch(nums,target,pivot+1,nums.length-1);

        }


    static int binarysearch(int[] arr,int target, int start, int end){
        while(start <= end){
            int middle = start+(end-start)/2;

            if (arr[middle]<target){
                start= middle +1;
            }
            else if(target<arr[middle]){
                end=middle-1;
            }else {
                return middle ;
            }

        }
        return -1;
    }
    static int findpivot(int[] arr) {
        int start  = 0 ;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //case 1
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //case 2
            if (mid > start && arr[mid]<arr[mid-1]){
             return mid-1;
            }
            //case 3
            if(arr[mid]<=arr[start]){
                end = mid -1 ;
            }
            //case 4
            else {
                start = mid +1;
            }
        }
        return -1;
    }
    static int findpivotwithduplicate(int[] arr) {
        int start  = 0 ;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //case 1
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //case 2
            if (mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //case 3
            if (arr[mid]==arr[start]&& arr[mid]==arr[end]){
                if (arr[start]>arr [start+1]){
                    return start;
                }
                start++;
                if (arr[end] < arr [end -1 ]){
                    return end-1;
                }
                end--;
            }
            else if (arr[start]<arr[mid] || arr[start]== arr[mid] && arr[end]<arr[mid]){
                start =mid +1;
            }
                else
                    end = mid -1;


        }
        return -1;
    }

}
