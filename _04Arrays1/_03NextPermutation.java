package _04Arrays1;
// LeetCode 31: Next Permutation.

import java.util.Arrays;

public class _03NextPermutation {
    public static void nextPermutation(int[] arr){
        int ind = -1;
        for (int i = arr.length-2; i >= 0 ; i--) {
            if(arr[i] < arr[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverseArray(arr, 0);
            return;
        }
        for (int i = arr.length-1; i >= ind; i--) {
            if(arr[i] > arr[ind]){
                int temp = arr[i];      // swapped.
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        reverseArray(arr, ind + 1);
    }

    private static void reverseArray(int[] arr, int index) {
        int start = index;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];      // swapped.
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
//        int[] arr = {2,1,5,4,3,0,0};
//        nextPermutation(arr);
//        System.out.println(Arrays.toString(arr));

        int[] arr = {3,2,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
