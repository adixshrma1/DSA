package _10Recursion.striverSDE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class _02subsetDuplicate {       // leetCode 90.
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        helper(nums, 0, new ArrayList<>(), result, set);
        return result;
    }
    private static void helper(int[] arr, int index, List<Integer> list, List<List<Integer>> ans, HashSet<List<Integer>> set){
        if(index == arr.length){
            if(!set.contains(list)){
                set.add(list);
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        int elem = arr[index];
        list.add(elem);
        helper(arr, index+1, list, ans, set);

        list.remove(list.size()-1);
        helper(arr, index+1, list, ans, set);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));
    }
}
