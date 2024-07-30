package _09Sorting;

import java.util.Arrays;

public class _01Basics {
    public static void bubbleSort(int[] arr){       // O(n^2) best and worst, not stable.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    public static void selectionSort(int[] arr){    // O(n^2) best and worst, not stable.
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length-1-i;
            int maxIndex = findMax(arr, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }
    private static int findMax(int[] arr, int lastIndex){
        int maxIndex = 0;
        for (int i = 0; i <= lastIndex; i++) {
            if(arr[maxIndex] < arr[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void insertionSort(int[] arr){    // O(n) best, O(n^2) worst, stable.
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }

    // use only when numbers are from range (1,N)
    public static void cycleSort(int[] arr){        // O(n) in each case.
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                swap(arr, i, arr[i]-1);
            }
        }
    }
    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,6,4,9,8,7};
//        bubbleSort(nums);
//        insertionSort(nums);
//        selectionSort(nums);
//        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
