package _07Arrays4;

import java.util.HashMap;
import java.util.Map;


public class _05LargestSubArrayWithSum {
    // Problem link -> https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
    // GFG find Largest sub array with 0 sum
    public static int maxLen2(int[] arr, int n){     // brute force time limit exceeded.
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if(sum == 0){
                    maxLength = Math.max(maxLength, j-1+1);
                }
            }
        }
        return maxLength;
    }
    public static int maxLen3(int[] arr, int n){    // optimal
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if(sum == 0){
                maxLength = Math.max(maxLength, i + 1);
            }
            if(map.containsKey(sum)){
                maxLength = Math.max(maxLength, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return maxLength;
    }
    // Problem link:- https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_5713505?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=SUBMISSION
    // Longest sub array with sum k (positives + negative)
    public static int longestSubarrayWithSumK(int []a, long k) {        // optimal for positives and negatives
        Map<Long, Integer> map = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            if(map.containsKey(sum-k)){
                maxLen = Math.max(maxLen, i-map.get(sum-k));
            }else{
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    // Problem link:- https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_6682399?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
    // Positives only.
    public static int longestSubarrayWithSumK2(int []a, long k) {   // optimal for positives only.
        int i=0;
        int j=0;
        long sum = a[0];
        int len = 0;
        while(j < a.length){
            while(sum > k && i <= j){
                sum = sum - a[i];
                i++;
            }
            if(sum == k){
                len = Math.max(len, j-i+1);
            }
            j++;
            if(j<a.length) sum = sum + a[j];
        }
        return len;
    }
    public static void main(String[] args) {
//        // longest sub array with sum 0
//        int[] arr = {15,-2,2,-8,1,7,10,23};
//        int n = 8;
//        System.out.println(maxLen3(arr, n));
//        System.out.println(maxLen3(new int[]{-1,1,-1,1}, 4));

        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        System.out.println(longestSubarrayWithSumK2(arr, 3));
    }
}
