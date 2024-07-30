package _10Recursion.Assignments._01Easy;

import java.util.Arrays;
import java.util.List;

public class _01 {
    // https://www.geeksforgeeks.org/sum-triangle-from-array/
    static void sumTriangle(int[] arr){
        if(arr.length < 1){
            return;
        }
        int[] nums = new int[arr.length-1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i] + arr[i+1];
        }
        sumTriangle(nums);
        System.out.println(Arrays.toString(arr));
    }
    // https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
    static int findMin(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
        int lastIndex = arr.length-1;
        int[] temp = Arrays.copyOfRange(arr, 0,lastIndex);      // this function is exclusive [0,n)
        temp[lastIndex-1] = Math.min(arr[lastIndex-1], arr[lastIndex]);
        return findMin(temp);
    }
    static int findMax(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
        int lastIndex = arr.length-1;
        int[] temp = Arrays.copyOfRange(arr, 0,lastIndex);      // this function is exclusive [0,n)
        temp[lastIndex-1] = Math.max(arr[lastIndex-1], arr[lastIndex]);
        return findMax(temp);
    }

    // find first uppercase.
    // https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
    static char findUpper1(String str){      // iterative.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) return ch;
        }
        return 0;
    }
    static char findUpper2(String str){     // recursive.
        if(str.length() == 0) return 0;
        char ch = str.charAt(0);
        if(Character.isUpperCase(ch)) return ch;
        else return findUpper2(str.substring(1));
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        sumTriangle(arr);
//        System.out.println(findMin(arr));
//        System.out.println(findMax(arr));

        String str = "geeksforgeekS";
        System.out.println(findUpper1(str));
        System.out.println(findUpper2(str));
    }
}
