package _08Searching;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class _03MedianIn2DArray {
    public static int median(int[][] matrix, int R, int C) {      // brute force (Time Limit Exceeded)
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        int i=list.size()-1;
        return list.get(i/2);
    }


    public static int medianOptimal(int[][] matrix, int R, int C){
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < R; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][C-1]);
        }
        int req = (R*C)/2;
        while(low <= high){
            int mid = (low + high)/2;
            int smallerEqual = findSmallerEqual(matrix, mid);
            if(smallerEqual <= req) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
    private static int findSmallerEqual(int[][] matrix, int key){
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            count += upperBound(matrix, i, key);
        }
        return count;
    }
    private static int upperBound(int[][] matrix, int i, int key){      // it counts how many values are <= number provided in funct args.
        int ans = matrix[0].length;
        int start = 0;
        int end = matrix[0].length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(matrix[i][mid] <= key){
                start = mid+1;
            }else{
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5},
                         {2, 6, 9},
                         {3, 6, 9}};
        System.out.println(medianOptimal(matrix, 3,3));
    }
}
