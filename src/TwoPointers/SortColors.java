package TwoPointers;

public class SortColors {
    public static void main(String[] args) {

    }
    public void sortColors(int[] nums) {
        int i  =0;
        int start =0 ;
        int end = nums.length -1;
        while(i <= end ){
            if(nums[i] == 0){
                swap(nums, i , start);
                i++;
                start++;
            }else if(nums[i] ==2){
                swap(nums, i , end);
                end--;
            }else{
                i++;
            }
        }
    }
    public void swap(int[] nums , int index , int place){
        int temp = nums[index];
        nums[index] = nums[place];
        nums[place] = temp;
    }
}
