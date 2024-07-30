package _03BitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _03Operators2 {
    public static boolean isPowOfTwo(int num){
        return (num & (num - 1)) == 0;
    }
    public static int countSetBit(int num){     // num & (1<<i) > 0
        int count = 0;
        while(num > 0){
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
//    how many bits to flip to reach the goal
    public static int bitsToFlip(int num, int goal){
        int count = 0;
        int temp = num ^ goal;
        while(temp>0){
            if ((temp & 1)== 1){
                count++;
            }
            temp = temp >> 1;
        }
        return count;
    }
    public static ArrayList<ArrayList<Integer>> powerSet(int[] arr){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        int subset = 1 << n;    // 2 raise to the power n;
        for (int i = 0; i < subset; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if((i & (1<<j)) > 0){
                    list.add(arr[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }

    public static int singleNumberBruteForce(int[] arr){      // Brute force method.
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static int singleNumberBitwise(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(isPowOfTwo(2));
//        System.out.println(isPowOfTwo(16));
//        System.out.println(isPowOfTwo(64));
//        System.out.println(isPowOfTwo(10));
//        System.out.println(isPowOfTwo(12));

//        System.out.println(countSetBit(32));
//        System.out.println(countSetBit(15));

//        System.out.println(bitsToFlip(10, 7));
//        System.out.println(bitsToFlip(16, 15));

//        int[] nums = {1,2,3};
//        System.out.println(powerSet(nums));

//        int[] nums = {4,1,2,1,2};
//        System.out.println(singleNumberBruteForce(nums));
//        System.out.println(singleNumberBitwise(nums));
    }
}
