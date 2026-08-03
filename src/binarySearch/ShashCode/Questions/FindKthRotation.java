package binarySearch.ShashCode.Questions;

public class FindKthRotation {
    public static void main(String[] args) {
            int[] arr = {5,1,3};
            System.out.println(findKRotation(arr));
    }
    public static  int findKRotation(int[] arr) {
        // Code here
        int start =0 ;
        int end = arr.length-1;
        int index=0;
        while(start<=end){
            int mid = start+((end-start)/2);
            if(arr[start]<= arr[mid]){
                if(arr[start] < arr[index]){
                    index = start;
                }
                start = mid +1;
            }else{
                if(arr[mid] < arr[index]){
                    index = mid;
                }
                end = mid -1;
            }
        }
        return index;

    }

}
