package binarySearch.ShashCode.Questions;

public class KthElementOfTwoArray {
    public static void main(String[] args) {

    }public int kthElement(int[] a, int[] b, int k) {
        // code here
        if(a.length > b.length){
            return kthElement(b, a, k);
        }
        int n1 = a.length;
        int n2 = b.length;
        int start = Math.max(0,k-n2);
        int end = Math.min(k, n1);
        while(start <= end){
            int cutOnA = start + ((end -start)/2);
            int cutOnB =k- cutOnA;
            int left1 = cutOnA == 0 ? Integer.MIN_VALUE : a[cutOnA-1];
            int left2 = cutOnB == 0 ? Integer.MIN_VALUE : b[cutOnB-1];
            int right1 = cutOnA == a.length ? Integer.MAX_VALUE : a[cutOnA];
            int right2 = cutOnB == b.length ? Integer.MAX_VALUE : b[cutOnB];

            if(left1 <= right2 && left2 <= right1){
                return Math.max(left1, left2);
            }else if(left1 > right2){
                end = cutOnA -1;
            }else{
                start = cutOnA+1;
            }
        }
        return 0;
    }
}
