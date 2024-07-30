package _06Arrays3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// LC 493.
public class _06ReversePairs {
    public static int reversePairs1(int[] nums) {    // brute force, time limit exceeded.
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > (long)2*nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    private static int countPairs(int[] nums, int s, int m, int e){
        int i = s;
        int j = m+1;

        int count = 0;
        while(i <= m){
            if(j <= e && nums[i] > (long)2*nums[j]){
                count += (m-i+1);
                j++;
            }else{
                i++;
            }
        }
        return count;
    }
    public static int mergeSortMethod(int[] nums, int s, int e){
        int count = 0;
        if(s == e) return count;
        int m = (s + e)/2;

        count += mergeSortMethod(nums, s, m);
        count += mergeSortMethod(nums, m+1, e);
        count += countPairs(nums, s, m, e);
        merge(nums, s, m, e);
        return count;
    }

    private static void merge(int[] nums, int s, int m, int e){
        List<Integer> list = new ArrayList<>();
        int i = s;
        int j = m+1;

        while(i <= m && j <= e){
            if(nums[i] <= nums[j]){
                list.add(nums[i]);
                i++;
            }else{
                list.add(nums[j]);
                j++;
            }
        }
        while(i <= m){
            list.add(nums[i]);
            i++;
        }
        while(j <= e){
            list.add(nums[j]);
            j++;
        }
        for (int k = 0; k < list.size(); k++) {
            nums[s+k] = list.get(k);
        }
    }

    public static void main(String[] args) {
//        int[] nums = {3,2,5,64,8,7,9};
//        mergeSortMethod(nums, 0, nums.length-1);
//        System.out.println(Arrays.toString(nums));

//        int[] arr = {6,13,21,25,1,2,3,4,5,9,11,13};
//        System.out.println(countPairs(arr, 0,3,arr.length));

        int[] arr2 = {1,3,2,3,1};
        System.out.println(mergeSortMethod(arr2, 0, arr2.length-1));
    }
}
