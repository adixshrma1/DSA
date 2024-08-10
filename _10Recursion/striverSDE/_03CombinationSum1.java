package _10Recursion.striverSDE;

import java.util.List;
import java.util.ArrayList;
public class _03CombinationSum1 {
    static List<List<Integer>> combinationSum(int[] candidates, int target){    // LeetCode 39.
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, 0, 0, new ArrayList<>(), result);
        return result;
    }
    private static void helper(int[] candidates, int target, int sum, int index, List<Integer> list, List<List<Integer>> result){
        if(sum > target) return;
        if(sum == target){
            result.add(new ArrayList<>(list));
            return;
        }
        if(index == candidates.length) return;

        int elem = candidates[index];
        list.add(elem);
        helper(candidates, target, sum+elem, index, list, result);
        list.remove(list.size()-1);

        helper(candidates, target, sum, index+1, list, result);
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}
