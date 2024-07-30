package _10Recursion.Assignments._01Easy;

import java.util.ArrayList;

public class _03 {
    // (Special fibonacci) https://www.codechef.com/problems/FIBXOR01/?tab=statement
    public static int fib(int a, int b, int n){     // recursive.
        if(n == 0) return a;
        if(n == 1) return b;
        return fib(a, b, n-2) ^ fib(a, b,n-1);
    }
    public static int fib2(int a, int b, int n){    // iterative.
        if(n == 0) return a;
        if(n == 1) return b;
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = a ^ b;
            a = b;
            b = ans;
        }
        return ans;
    }
    public static int fib3(int a, int b, int n){    // optimal
        if(n % 3 == 0) return a;
        else if(n % 3 == 1) return b;
        else return a^b;
    }
    // link: https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
    // length of string using recursion.
    public static int findStrLength(String str, int index, int count){
        if(index == str.length()) return count;

        char ch = str.charAt(index);
        if(ch == ' ') return count;
        else{
            count++;
        }
        return findStrLength(str, index+1, count);
    }

    // geek-onacci number.
    // link: https://www.geeksforgeeks.org/problems/geek-onacci-number/0
    public static int fib(int A, int B, int C, int N){
        if(N == 1) return A;
        else if(N == 2) return B;
        else if(N == 3) return C;

        return fib(A, B, C, N-1) + fib(A, B, C, N-2) + fib(A, B, C, N-3);
    }

    public static void main(String[] args) {
//        System.out.println(fib(5,9,5));
//        System.out.println(fib2(5,9,5));
//        System.out.println(fib3(5,9,5));

        System.out.println(findStrLength("geeks", 0, 0));
    }
}
