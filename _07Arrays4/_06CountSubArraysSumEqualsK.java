package _07Arrays4;

import java.util.HashMap;
import java.util.Map;

public class _06CountSubArraysSumEqualsK {      // LeetCode 560
    public static int subarraySum(int[] nums, int k){   // optimal solution.
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) +1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1,}, 2));
        System.out.println(subarraySum(new int[]{1,2,3,}, 3));
    }
}
