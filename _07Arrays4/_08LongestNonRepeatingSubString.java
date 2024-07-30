package _07Arrays4;

import java.util.HashMap;
import java.util.Map;

public class _08LongestNonRepeatingSubString {      // LeetCode 3.
    public static int lengthOfLongestSubstring(String s) {      // optimal
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = 0;
        int j = 0;
        while(j < s.length()){
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            map.put(s.charAt(j), j);
            maxLen = Math.max(maxLen, j-i+1);
            j++;

        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str1 = "abcabcbb";
        String str2 = "bbbb";
        System.out.println(lengthOfLongestSubstring(str1));
        System.out.println(lengthOfLongestSubstring(str2));
    }
}
