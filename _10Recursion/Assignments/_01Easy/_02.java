package _10Recursion.Assignments._01Easy;

import java.util.Arrays;

public class _02 {
    // LeetCode 334. Reverse String.
    public static void reverseString1(char[] s){     // iterative.
        int i = 0;
        int j = s.length-1;
        while(i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    static void reverseString2(char[] arr, int s, int e){       // recursive.
        if(s > e) return;
        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        reverseString2(arr, s+1, e-1);
    }

    // https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
    public static void printNos(int N) {
        //Your code here
        if(N < 1) return;
        printNos(N-1);
        System.out.print(N + " ");
    }

    // LeetCode 509. Fibonacci Number.
    public static int fib(int n) {      // recursive.
        if(n < 2) return n;
        return fib(n-2) + fib(n-1);
    }
    public static int fib2(int n){      // iterative.
        if(n < 2) return n;
        int a = 0;
        int b = 1;
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = a + b;
            a = b;
            b = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
//        char[] s = {'h', 'e', 'l', 'l', 'o'};
//        reverseString1(s);
//        reverseString2(s, 0, s.length-1);
//        System.out.println(Arrays.toString(s));

//        printNos(10);

        System.out.println(fib(8));
        System.out.println(fib2(8));


    }
}
