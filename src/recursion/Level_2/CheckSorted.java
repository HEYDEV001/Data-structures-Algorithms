package recursion.Level_2;

public class CheckSorted {
    public static void main(String[] args) {
int[]arr= {1,2,3,4,5,6,11,8,9};
        System.out.println(IsSorted(arr,0));
    }
    static boolean IsSorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && IsSorted(arr,index+1);
    }
}
