package _04Arrays1;

import java.util.Arrays;

public class _01SetMatrixZeros {
    public static void setMatrixZerosBF(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    markRow(arr, i);
                    markColumn(arr, j);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
    }

    private static void markColumn(int[][] arr, int j) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][j] !=0) {
                arr[i][j] = -1;
            }
        }
    }

    private static void markRow(int[][] arr, int i) {
        for (int j = 0; j < arr[0].length; j++) {
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }

    public static void setMatrixZerosBetter(int[][] arr){
        int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1,1},
                {1,0,0,1},
                {1,1,0,1},
                {1,1,1,1}
        };
//        setMatrixZerosBF(arr);
//        System.out.println(Arrays.deepToString(arr));

        int[][] arr2 = {
                {1,1,1,1},
                {1,0,1,1},
                {1,1,0,1},
                {1,0,0,1}
        };
        setMatrixZerosBetter(arr2);
        System.out.println(Arrays.deepToString(arr2));
    }
}
