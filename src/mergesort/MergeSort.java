package mergesort;

import java.util.Arrays;

/**
 * Created by mhan on 2/4/2017.
 */
public class MergeSort {
    public static void main(String[] args){
        int [] nums = Utils.randomArray(10, 30);
        System.out.println("before sorting: " + Arrays.toString(nums));
        mergeSort(nums);
        System.out.println("after sorting: " + Arrays.toString(nums));
    }

    public static void mergeSort(int[] a){
        //Write your code here

    }

    //pre: array a's length is left's length + right's length
    //     left and right is already sorted
    //post: array a is sorted in non-decreasing order with left and right element
    private static void merge(int[] a, int[] left, int[] right){
        //write your code here
    }
}
