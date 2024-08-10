package _10Recursion.striverSDE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _06PermutationSequence {   // leetCode 60.
    public static String getPermutation(int n, int k) {     // correct but TLE (my solution)
        String s = "";
        for(int i=1; i<=n; i++){
            s = s+i;
        }
        List<String> list = new ArrayList<>();
        helper("", s, list);
        Collections.sort(list);
        return list.get(k-1);
    }
    private static void helper(String p, String up, List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i);
            helper(f + ch + s, up.substring(1), list);
        }
    }
    public static String getPermutation2(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int fact = 1;
        for(int i=1; i < n; i++){
            fact *= i;
            list.add(i);
        }
        list.add(n);

        String ans = "";
        k = k-1;
        while(true){
            ans = ans + list.get(k/fact);
            list.remove(k/fact);
            if(list.size() == 0){
                break;
            }
            k = k % fact;
            fact = fact / list.size();
        }
        return ans;
    }
    public static void main(String[] args) {
//        System.out.println(getPermutation(3,3));
        System.out.println(getPermutation2(4, 17));
    }
}
