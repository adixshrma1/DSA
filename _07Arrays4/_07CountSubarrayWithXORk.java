package _07Arrays4;

import java.util.HashMap;
import java.util.Map;

// Problem link: https://www.interviewbit.com/problems/subarray-with-given-xor/
public class _07CountSubarrayWithXORk {
    public static int solve(int[] A, int B){    // brute force time limit exceeded.
        int count = 0;
        for(int i=0; i<A.length; i++){
            int xor = 0;
            for(int j=i; j<A.length; j++){
                xor = xor ^ A[j];
                if(xor == B){
                    count++;
                }
            }
        }
        return count;
    }
    public static int solve2(int[] A, int B) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int xor = 0;
        int count = 0;
        for(int i=0; i<A.length; i++){
            xor = xor ^ A[i];
            if(map.containsKey(xor ^ B)){
                count += map.get(xor ^ B);
            }
            map.put(xor, map.getOrDefault(xor, 0)+1);       // interview bit will not recognize .getOrDefault
        }                                                                // use simple methods using "if condition".
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int b = 6;
        System.out.println(solve2(arr, b));
        System.out.println(solve2(new int[]{5,6,7,8,9}, 5));
    }
}
