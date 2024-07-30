package _09Sorting;

import java.util.Arrays;

public class _03QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(low >= high) return;
        int i = low;
        int j = high;
        int mid = (i+j)/2;
        int pivot = arr[mid];
        while(i <= j){
            while(arr[i] < pivot) i++;
            while(arr[j] > pivot) j--;
            if(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(arr, low, j);
        quickSort(arr, i, high);
    }
    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,9,6,58,4,7,36,1,2,4};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
