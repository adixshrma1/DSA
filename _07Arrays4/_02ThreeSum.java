package _07Arrays4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02ThreeSum {     // LeetCode 15.
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listoflist = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j < k){
                int total = nums[i] + nums[j] + nums[k];
                if(total > 0){
                    k--;
                }else if(total < 0){
                    j++;
                }else{
                    listoflist.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while(nums[j] == nums[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
        return listoflist;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
        System.out.println(threeSum(new int[]{0,0,0,0}));
    }
}
