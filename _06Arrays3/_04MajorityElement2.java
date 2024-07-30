package _06Arrays3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _04MajorityElement2 {
    public static List<Integer> majorityElement1(int[] nums) {       // using hashmaps
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) +1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public static List<Integer> majorityElement2(int[] nums) {      // optimal
        List<Integer> list = new ArrayList<>();
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && element2 != nums[i]) {
                count1 = 1;
                element1 = nums[i];
            } else if (count2 == 0 && element1 != nums[i]) {
                count2 = 1;
                element2 = nums[i];
            }
            else if (nums[i] == element1) count1++;
            else if (nums[i] == element2) count2++;
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element1) count1++;
            if (nums[i] == element2) count2++;
        }
        if (count1 > nums.length / 3) list.add(element1);
        if (count2 > nums.length / 3) list.add(element2);
        return list;
    }
    public static void main(String[] args) {
//        int[] arr1 = {1,1,1,2,2,2,3,3,3};
//        int[] arr2 = {1,2,1,2,1,2,1,2};
//        System.out.println(majorityElement1(arr1));
//        System.out.println(majorityElement1(arr2));

        int[] arr3 = {0,0,0};
        System.out.println(majorityElement2(arr3));
    }
}
