package _10Recursion.striverSDE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _04CombinationSum2 {
//    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {       // TLE error at last few test cases.
//        List<List<Integer>> result = new ArrayList<>();
//        Arrays.sort(candidates);
//        HashSet set = new HashSet<>();
//        helper(candidates, target, 0, 0, new ArrayList<>(), result, set);
//        return result;
//    }
//    private static void helper(int[] candidates, int target, int sum, int index, List<Integer> list, List<List<Integer>> result, HashSet set){
//        if(sum > target) return;
//        if(sum == target){
//            if(!set.contains(list)){
//                result.add(new ArrayList<>(list));
//                set.add(list);
//            }
//            return;
//        }
//        if(index == candidates.length) return;
//
//        int elem = candidates[index];
//        list.add(elem);
//        helper(candidates, target, sum+elem, index+1, list, result, set);
//        list.remove(list.size()-1);
//
//        helper(candidates, target, sum, index+1, list, result, set);
//    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    private static void helper(int[] candidates, int target, int index, List<Integer> list, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(index == candidates.length) return;

        for (int i = index; i < candidates.length; i++) {
            if(i > index && candidates[i-1] == candidates[i]){
                continue;
            }
            if(candidates[i] > target) break;
            list.add(candidates[i]);
            helper(candidates, target - candidates[i], i+1, list, result);
            list.remove(list.size()-1);

        }
    }
    public static void main(String[] args) {
        int[] candidates = {2,2,1,2,5};
        int target = 5;

//        int[] candidates = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
//        int target = 30;
        System.out.println(combinationSum2(candidates, target));

    }
}
