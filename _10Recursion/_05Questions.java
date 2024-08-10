package _10Recursion;

import java.util.ArrayList;
import java.util.List;

public class _05Questions {
    // LeetCode 17.
    public static List<String> letterCombinations(String digits) {      // Google
        if(digits.isEmpty()) return new ArrayList<>();
        else return helper("", digits);
    }
    private static List<String> helper(String p, String up){
        List<String> ans = new ArrayList<>();
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        int digit = up.charAt(0) - '0';
        if(digit < 7){
            for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
                char toAdd = (char)('a' + i);
                ans.addAll(helper(p + toAdd, up.substring(1)));
            }
        }else if(digit == 7){
            for (int i = 15; i <= 18; i++) {
                char toAdd = (char)('a' + i);
                ans.addAll(helper(p + toAdd, up.substring(1)));
            }
        }else if(digit == 8){
            for (int i = 19; i <=21; i++) {
                char toAdd = (char)('a' + i);
                ans.addAll(helper(p + toAdd, up.substring(1)));
            }
        }else{
            for (int i = 22; i <=25; i++) {
                char toAdd = (char)('a' + i);
                ans.addAll(helper(p + toAdd, up.substring(1)));
            }
        }

        return ans;
    }

    public static List<String> dieThrow(String p, int target){
        List<String> list = new ArrayList<>();
        if(target == 0){
            list.add(p);
            return list;
        }
        for (int i = 1; i <= target; i++) {
            list.addAll(dieThrow(p + i, target-i));
        }
        return list;
    }
    public static void main(String[] args) {
//        System.out.println(letterCombinations("79"));
//        System.out.println(letterCombinations(""));

        System.out.println(dieThrow("", 4));
    }
}
//    char ch = 'a' + 1;      // this will give 'b'
//    int digit = '2' - '0';    // this will give 2 (integer)
//    int digit = '2';    // this will give 50 (ascii value)