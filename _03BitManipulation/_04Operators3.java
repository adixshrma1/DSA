package _03BitManipulation;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class _04Operators3 {
    public static int singleNumber2BruteForce(int[] arr){       // 1 single number other are 3.
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) +1);
            }else{
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static int singleNumber2Bitwise(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int digitsInMax = (int)(Math.log(max)/Math.log(2)) + 1;

        int ans = 0;
        for (int bitIndex = 0; bitIndex < digitsInMax; bitIndex++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if((arr[i] & (1<<bitIndex)) > 0){
                    count++;
                }
            }
            if(count % 3 == 1){
                ans = ans | (1 << bitIndex);
            }
        }
        return ans;
    }
    //Question:- two distinct numbers are occurring once, and others are occurring twice.
    //           Return an array of numbers occurring once.
    public static ArrayList<Integer> twoSingleNumbersBruteForce(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
    public static int XORinRangeBruteForce(int n){      // 1^2^3^....^n
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = ans^i;
        }
        return ans;
    }
    public static int XORinRange(int n){
        if(n%4 == 1){
            return 1;
        }else if(n%4 == 2){
            return n+1;
        }else if (n%4 == 3) {
            return 0;
        }else{
            return n;
        }
    }
    public static int XORinRange(int l, int r){
        return XORinRange(l-1) ^ XORinRange(r);
    }
    public static int divideWithoutOperators(int dividend, int divisor){    // Brute force.
        int sum = 0;
        int count = 0;
        while(sum + divisor <= dividend){
            sum = sum + divisor;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
//        int[] arr = {1,1,1,2,2,2,3,5,5,5};
//        System.out.println(singleNumber2BruteForce(arr));
//        System.out.println(singleNumber2Bitwise(arr));

//        int[] arr = {4,2,2,6,3,4,3,9};
//        System.out.println(twoSingleNumbersBruteForce(arr));

//        System.out.println(XORinRangeBruteForce(5));
//        System.out.println(XORinRangeBruteForce(6));

//        System.out.println(XORinRange(5));
//        System.out.println(XORinRange(6));
//        System.out.println(XORinRange(7));
//        System.out.println(XORinRange(8));

//        System.out.println(XORinRange(4, 7));
//        System.out.println(XORinRange(4, 8));

        System.out.println(divideWithoutOperators(22, 7));
    }
}
