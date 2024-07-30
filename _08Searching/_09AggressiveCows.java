package _08Searching;

import java.util.Arrays;

// Problem:- https://www.spoj.com/problems/AGGRCOW/
public class _09AggressiveCows {
    public static int aggressiveCows(int[] arr, int cows){
        Arrays.sort(arr);
        int low = 0;
        int high = arr[arr.length-1] - arr[0];
        while(low <= high){
            int mid = (low + high)/2;
            if(canWePlace(arr, mid, cows)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return high;
    }
    public static boolean canWePlace(int[] arr, int dis, int cows){
        int last = arr[0];
        int cowCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - last >= dis){
                cowCount++;
                last = arr[i];
            }
            if(cowCount >= cows) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,1,3,6};
        System.out.println(aggressiveCows(arr, 2));
    }
}
