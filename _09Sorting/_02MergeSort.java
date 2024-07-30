package _09Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02MergeSort {
    public static void mergeSort(int[] arr, int start, int end){        // O(nlogn) in every case.
        if(start == end) return;
        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    private static void merge(int[] arr, int start, int mid, int end){
        List<Integer> list = new ArrayList<>();
        int i = start;
        int j = mid+1;
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                list.add(arr[i]);
                i++;
            }else{
                list.add(arr[j]);
                j++;
            }
        }
        while(i <= mid){
            list.add(arr[i]);
            i++;
        }
        while(j <= end){
            list.add(arr[j]);
            j++;
        }
        for (int k = 0; k < list.size(); k++) {
            arr[start + k] = list.get(k);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,3,2,6,5,4,7,8,8,9};
        mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
