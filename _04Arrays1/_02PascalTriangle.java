package _04Arrays1;

import java.util.List;
import java.util.ArrayList;

// if indexing starts from zero then nCr = rCc
// if indexing starts from 1 then (n-1)C(r-1) = (r-1)C(c-1)

public class _02PascalTriangle {
//    // Question: row and col is given, find element of pascal's triangle
//    private static int factorial(int n){
//        if(n < 2){
//            return n;
//        }
//        return n * factorial(n-1);
//    }
//    public static int elementOfPascalTriangleBF(int r, int c){      // brute force
//        return factorial(r-1)/(factorial(c-1) * factorial(r-c));
//    }
//
//    // better method.
//    public static int elementOfPascalTriangleBetter(int n, int r){      // better
//        n = n -1;
//        r = r - 1;
//        double res = 1;
//        for (int i = 1; i <= r; i++) {
//            res = res * (n-r+i)/i;
//        }
//        return (int)res;
//    }

    // Question: printing whole Pascal's Triangle (LeetCode 118)
    private static int nCr(int n, int r){
        double res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n-r+i)/i;
        }
        return (int)res;
    }
    public static List<List<Integer>> generate1(int numRows) {       // brute force. (accepted)
        List<List<Integer>> listoflist = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=1; j<=i; j++){
                list.add(nCr(i-1,j-1));
            }
            listoflist.add(list);
        }
        return listoflist;
    }
    public static List<Integer> generateRow(int row){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int res = 1;
        for (int i = 1; i < row; i++) {
            res = res * (row - i)/i;
            list.add(res);
        }
        return list;
    }
    public static List<List<Integer>> generate2(int row){       // optimal (beats 100%)
        List<List<Integer>> listoflist = new ArrayList<>();
        for (int i = 1; i <= row; i++) {
            List<Integer> list = generateRow(i);
            listoflist.add(list);
        }
        return listoflist;
    }
    public static void main(String[] args) {
//        System.out.println(elementOfPascalTriangleBF(5,2));
//        System.out.println(elementOfPascalTriangleBetter(5,2));

        System.out.println(generate1(7));

        System.out.println(generate2(7));
    }
}
