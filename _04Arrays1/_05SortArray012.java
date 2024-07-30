package _04Arrays1;
// Problem: you will be given an array containing only 0s, 1s, 2s. Sort them.

import java.util.Arrays;

public class _05SortArray012 {
    public static void sort1(int[] arr){
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zero++;
            } else if(arr[i] == 1){
                one++;
            } else{
                two++;
            }
        }
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < zero + one; i++) {
            arr[i] = 1;
        }
        for (int i = zero + one; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

    // dutch national flag algorithm
    public static void sortOptimal(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            } else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,0,0,1,1,1,2,2,2,0,0,1,1,1,1,2};

//        sort1(arr);
//        System.out.println(Arrays.toString(arr));

        sortOptimal(arr);
        System.out.println(Arrays.toString(arr));
    }
}
