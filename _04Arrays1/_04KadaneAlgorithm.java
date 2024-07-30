package _04Arrays1;

import java.util.Arrays;

// Maximum sub-array
public class _04KadaneAlgorithm {
    public static int maxSum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static int[] maxSumSubArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int startIndex = -1;
        int endIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(sum == 0){
                startIndex = i;
            }
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
                endIndex = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        int[] subArray = new int[endIndex - startIndex + 1];
        for (int i = startIndex; i <= endIndex; i++) {
            subArray[i-startIndex] = arr[i];
        }
        return subArray;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSum(arr));
        System.out.println(Arrays.toString(maxSumSubArray(arr)));
    }
}
