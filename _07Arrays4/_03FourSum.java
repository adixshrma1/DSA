package _07Arrays4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03FourSum {       // LeetCode 18
    public static List<List<Integer>> fourSome(int[] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length-3; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1; j < nums.length-2; j++) {
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int k = j+1;
                int l = nums.length-1;
                while(k < l){
                    long total = nums[i];
                    total += nums[j];
                    total += nums[k];
                    total += nums[l];
                    if(total > target) l--;
                    else if(total < target) k++;
                    else{
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[k] == nums[k+1]) l--;
                    }
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] nums = {1,0,-1,0,-2,2};
//        int target = 0;
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        System.out.println(fourSome(nums, target));
    }
}
