package recursion.Level_2;

import java.util.ArrayList;

public class LS {
    public static void main(String[] args) {
        int[]arr= {1,2,3,4,5,6,11,8,8,9};
//        System.out.println(Find(arr,8,0));
//        System.out.println(Find1(arr,8,0));
//        System.out.println(Findfromlast(arr,8,arr.length-1));
//        System.out.println(Find2(arr,8,arr.length-1));
//
//        System.out.println(FindAllindex(arr,8,arr.length-1,new ArrayList<>()));
        System.out.println(FindAllindex2(arr,8,arr.length-1));
    }
    // return true or false
    static boolean Find(int[]arr, int target, int index){
        if(index==arr.length){
           return false;
        }
        return arr[index]==target|| Find(arr,target,index+1);
    }
    // return the index
    static int Find1(int[]arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return  Find1(arr,target,index+1);
    }
    // This checks from the last
    static boolean Findfromlast(int[]arr, int target, int index){
        if(index==-1){
            return false;
        }
        return arr[index]==target|| Find(arr,target,index-1);
    }
    // This checks from the last
    static int Find2(int[]arr, int target, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return  Find1(arr,target,index-1);
    }

    static ArrayList<Integer> FindAllindex(int[]arr, int target, int index,ArrayList<Integer> list){
        if(index==-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return  FindAllindex(arr,target,index-1,list);
    }

    static ArrayList<Integer> FindAllindex2(int[]arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=  FindAllindex2(arr,target,index-1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
