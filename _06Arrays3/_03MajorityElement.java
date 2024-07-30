package _06Arrays3;

import java.util.Map;
import java.util.HashMap;

public class _03MajorityElement {
    public static int majorityElement(int[] nums) {     // brute force O(n2)
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
    public static int majorityElement2(int[] nums){     // better but uses extra space.
        Map<Integer, Integer> map = new HashMap<>();
        for(int element : nums){
            if(map.containsKey(element)){
                map.put(element, map.get(element) +1);
            }else{
                map.put(element, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }

    // Moore's Voting algorithm.
    public static int majorityElement3(int[] nums){     // optimal
        int element = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                element = nums[i];
                count = 1;
            }else if(nums[i] == element){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,2,1,2,1};
//        System.out.println(majorityElement(nums));
//        System.out.println(majorityElement2(nums));
        System.out.println(majorityElement3(nums));
    }
}
