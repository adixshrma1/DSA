package _07Arrays4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// LeetCode 1
public class _01TwoSum {
    public static int[] twoSum1(int[] nums, int target) {       // brute force.
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static int[] twoSum2(int[] nums, int target){        // better
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                int[] ans = {i, map.get(target - nums[i])};
                Arrays.sort(ans);
                return ans;
            } else{
                map.put(nums[i], i);
            }

        }
        return new int[]{-1,-1};
    }
    // if array is sorted you can use two pointer approach.
    public static int[] twoSum3(int[] nums, int target){    // array is sorted here.
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            if(nums[i] + nums[j] > target){
                j--;
            }else if(nums[i] + nums[j] < target){
                i++;
            }else{
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        System.out.println(Arrays.toString(twoSum1(nums, 9)));
//        System.out.println(Arrays.toString(twoSum2(nums, 9)));

        int[] arr = {2,6,7,8,15};
        System.out.println(Arrays.toString(twoSum3(arr, 13)));
        System.out.println(Arrays.toString(twoSum3(arr, 15)));
    }
}
