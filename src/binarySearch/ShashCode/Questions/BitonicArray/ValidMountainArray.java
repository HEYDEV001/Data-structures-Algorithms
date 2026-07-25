package binarySearch.ShashCode.Questions.BitonicArray;

public class ValidMountainArray {
    public static void main(String[] args) {
        int [] arr = {1,3,4, 5,3 ,2};
        System.out.println(validMountainArray(arr));

    }
    public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int i =0;
        while(i < arr.length-1){
            if(arr[i] < arr[i+1]){
                i++;
            }else{
                break;
            }
        }
        if(i == arr.length-1 || i == 0){
            return false;
        }
        while(i < arr.length-1){
            if(arr[i] > arr[i+1]){
                i++;
            }else{
                return false;
            }

        }
        return true;

    }
}
