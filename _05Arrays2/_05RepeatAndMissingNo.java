package _05Arrays2;

import java.util.Arrays;

public class _05RepeatAndMissingNo {
    public static int[] repeatedNumber1(final int[] A) {    // it takes extra space.
        int[] arr = new int[A.length+1];
        for(int i=0; i<A.length; i++){
            arr[A[i]]++;
        }
        int repeat = -1;
        int missing = -1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == 2){
                repeat = i;
            }
            if(arr[i] == 0){
                missing = i;
            }
        }
        return new int[]{repeat, missing};
    }
    public static int[] repeatedNumber2(final int[] A) {    // it will not take extra space.
        long s = 0;        // sum of numbers of array.
        long s2 = 0;       // sum of squares of each number of array.
        for (int j : A) {
            s = s + j;
            s2 = s2 + (long)Math.pow(j, 2);
        }
        long n = A.length;
        long sn = (n*(n+1))/2;      // sum of n natural numbers.
        long sn2 = (n*(n+1)*(2*n+1))/6;     // sum of square of n natural numbers.

        long val1 = s-sn;   // x-y
        long val2 = s2-sn2;     // x^2 - y^2
        val2 = val2/val1;       // x+y
        long repeating = (val1 + val2)/2;
        long missing = repeating - val1;

        return new int[]{(int)repeating, (int)missing};
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,3};
        System.out.println(Arrays.toString(repeatedNumber1(arr)));
        System.out.println(Arrays.toString(repeatedNumber2(arr)));
    }
}
