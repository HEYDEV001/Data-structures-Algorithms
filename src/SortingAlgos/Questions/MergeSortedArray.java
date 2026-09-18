package SortingAlgos.Questions;

public class MergeSortedArray {
    public static void main(String[] args) {

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        for(int i = 0 ; i < m ; i++){
            nums1Copy[i] = nums1[i];
        }
        int leftIndex =0;
        int rightIndex = 0;
        int k = 0;
        while(leftIndex < nums1Copy.length && rightIndex< nums2.length){
            if(nums1Copy[leftIndex] < nums2[rightIndex]){
                nums1[k] = nums1Copy[leftIndex];
                leftIndex++;
            }else{
                nums1[k] = nums2[rightIndex];
                rightIndex++;
            }
            k++;
        }
        while(leftIndex < nums1Copy.length){
            nums1[k] = nums1Copy[leftIndex];
            leftIndex++;
            k++;
        }
        while(rightIndex < nums2.length){
            nums1[k] = nums2[rightIndex];
            rightIndex++;
            k++;
        }

    }
}
