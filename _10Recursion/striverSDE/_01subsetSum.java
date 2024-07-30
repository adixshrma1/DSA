package _10Recursion.striverSDE;

import java.util.ArrayList;
import java.util.Collections;

public class _01subsetSum {
    // subset sum.
    // https://www.geeksforgeeks.org/problems/subset-sums2234/1
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {      // iterative (by bit manipulation)
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i< (1<<n); i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                if((i & (1<<j)) > 0){
                    sum = sum + arr.get(j);
                }
            }
            ans.add(sum);
        }
        return ans;
    }

    public static void helper(ArrayList<Integer> arr, int n, int index, int sum, ArrayList<Integer> list){
        if(index == n){
            list.add(sum);
            return;
        }
        helper(arr, n, index+1, sum + arr.get(index), list);

        helper(arr, n, index+1, sum, list);
    }
    public static ArrayList<Integer> subsetSums1(ArrayList<Integer> arr, int n){    // recursive method.
        ArrayList<Integer> list = new ArrayList<>();
        helper(arr, n, 0, 0, list);
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
//        System.out.println(subsetSums(list, 2));
        System.out.println(subsetSums1(list , 2));
    }
}
