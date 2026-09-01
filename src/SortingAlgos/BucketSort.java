package SortingAlgos;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        float [] arr = {0.12f, 0.98f, 0.95f, 0.85f, 0.75f, 0.65f};
        System.out.println(bucketSort(arr));

    }
    public static ArrayList<Float> bucketSort(float[] arr) {
        if(arr.length ==0){
            return new ArrayList<>();
        }
        // Finding the bucket Size
        float maxElement = Integer.MIN_VALUE;
        for(float a : arr){
            maxElement = (float) Math.max(maxElement,a);
        }
        int maxIndex =(int) (maxElement * arr.length);
        int bucketSize = maxIndex +1 ;

        // Here we've created Array of ArrayList of the bucketSeize
        ArrayList<Float> [] bucket = new ArrayList[bucketSize];
        // Here we've put Empty ArrayList A\at every index of the Array
        for(int a = 0; a < bucketSize; a++){
            bucket[a] = new ArrayList<>();
        }
        // Inset Elements in the Buckets
        for(int j = 0;  j<bucketSize; j++){
            int index =(int) (arr[j] * arr.length);
//            bucket[index].add(arr[j]);
            int targetIndex =0;
            while(targetIndex < bucket[index].size() && arr[j] > bucket[index].get(targetIndex)){
                targetIndex++;
            }
            bucket[index].add(targetIndex, arr[j]);
        }
        // Sort the buckets
//        for(int j = 0;  j< bucketSize; j++){
//            Collections.sort(bucket[j]);
//        }
        // Store the elements in the result list
        ArrayList<Float> result = new ArrayList<>();
        for(int k = 0; k < bucketSize; k++){
            result.addAll(bucket[k]);
        }
        return result;
    }
}
