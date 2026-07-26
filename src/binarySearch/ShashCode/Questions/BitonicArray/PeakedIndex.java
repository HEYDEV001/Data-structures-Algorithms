package binarySearch.ShashCode.Questions.BitonicArray;

public class PeakedIndex {
    public static void main(String[] args) {
        int [] arr = {1,3,4, 5,3 ,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid  = start + ((end-start)/2);
            if(mid !=0 && mid != arr.length-1 && arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }else if (mid!=arr.length -1 && arr[mid] < arr[mid+1]){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1 ;
    }
}
