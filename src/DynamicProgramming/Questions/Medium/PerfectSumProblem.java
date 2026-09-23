package DynamicProgramming.Questions.Medium;

public class PerfectSumProblem {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 3};
        System.out.println(countSubSequences(arr, 10));

    }
    public static  int countSubSequences(int [] arr, int target) {
        int index = arr.length-1;
        return recur(arr, target, index);
    }

    public static  int recur(int [] arr, int target, int index) {
            if(index == 0){
                if(arr[0] == target){
                    return 1;
                }
            }
            if(target == 0){
                return 1;
            }
            if(index >= 0){
                int pick = recur(arr, target-arr[index], index-1);
                int noPick = recur(arr, target, index-1);
                return noPick + pick;
            }
            return 0;
            }
}
