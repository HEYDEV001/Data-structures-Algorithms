package DynamicProgramming.Questions.Medium;

public class CountSubSetsWithSum {
    public static void main(String[] args) {

    }
    static int perfectSum(int[] arr, int target) {
        return recur(arr, target, arr.length-1);

    }

    public static  int recur(int [] arr, int target, int index) {
        if(index == 0){
            if(arr[0] == target && target ==0) return 2;
            else if(target ==0 ) return 1;
            else if(target == arr[index]) return 1;
            else return 0;
        }
        int  pick =0;
        if(arr[index] <= target){
            pick = recur(arr, target-arr[index], index-1);

        }
        int noPick = recur(arr, target, index-1);
        return noPick + pick;
    }
}
