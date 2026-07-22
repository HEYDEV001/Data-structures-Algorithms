package LinearSearch;

public class NewQuestions {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4 ,5 ,6 ,1, 8, 9, 1};
        System.out.println(findMax(nums));
        System.out.println(findMin(nums));

    }

    public static int findMax(int [] arr ){
        int max = arr[0];
//        int max = Integer.MIN_VALUE;
        // can choose either of these
        for(int num : arr){
            max = Math.max(max, num);
        }
        return max;
    }

    public static int findMin(int[]arr){
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            min = Math.min(min, num);
        }
        return min;
    }
}
