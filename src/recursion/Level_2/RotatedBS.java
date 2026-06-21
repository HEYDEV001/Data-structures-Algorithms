package recursion.Level_2;

import java.util.ArrayList;

public class RotatedBS {
    public static void main(String[] args) {

        int []arr = {5,6,7,8,9,1,1,3,4};
        System.out.println(search1(arr,1,0,arr.length-1,new ArrayList<>()));
    }
    static int search(int[]arr,int target,int start,int end) {
        if(start > end) {
            return -1;
        }
        int mid   = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]) {
            if (target >=arr[start] && target <= arr[mid]  ){
                return search(arr, target, start, mid - 1);
            }
        else{
                return search(arr, target, mid + 1, end);
            }
        }
        if(target>=arr[mid] && target<=arr[end]){
            return search(arr,target,mid+1,end);
        }
        else{
            return search(arr,target,start,mid-1);
        }
    }



    static ArrayList<Integer> search1(int[]arr, int target, int start, int end, ArrayList<Integer> list) {
        if(start > end) {
            return list;
        }
        int mid   = start + (end-start)/2;
        if(arr[mid]==target){
            list.add(mid);
        }
        if(arr[start]<=arr[mid]) {
            if (target >=arr[start] && target <= arr[mid]  ){
                return search1(arr, target, start, mid - 1,list);
            }
            else{
                return search1(arr, target, mid + 1, end,list);
            }
        }
        if(target>=arr[mid] && target<=arr[end]){
            return search1(arr,target,mid+1,end,list);
        }
        else{
            return search1(arr,target,start,mid-1,list);
        }
    }
}
