package binarySearch.ShashCode.Questions;

public class SearchRotatedArrayII {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int target = 3;
        System.out.println(search(arr,target));
    }
    public static boolean search(int[] arr, int target) {
        int start  =0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + ((end-start)/2);
            if(arr[mid] == target){
                return true;
            }
            // if there are duplicates in the array then we can trim down the search space to get our sorted part and then later search in the sorted part
            if(arr[start]== arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
            }

            else if(arr[start]<= arr[mid]){
                if(target>= arr[start]  && target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > arr[mid] && target <= arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
