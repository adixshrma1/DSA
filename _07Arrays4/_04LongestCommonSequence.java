package _07Arrays4;

import java.util.Arrays;

public class _04LongestCommonSequence {     // LeetCode 128
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }else if(i>0 && nums[i] == nums[i-1]+1){
                count++;
                max = Math.max(max, count);
            }
            else{
                count = 1;
            }
        }
        return Math.max(max, count);
    }
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(longestConsecutive(nums));
    }
}
