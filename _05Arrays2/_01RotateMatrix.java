package _05Arrays2;
import java.util.Arrays;

public class _01RotateMatrix {
    public static int[][] rotate(int[][] arr){              // brute force, it takes O(n^2) space complexity
        int[][] newArray = new int[arr.length][arr[0].length];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[0].length; j++) {
                newArray[i][j] = arr[arr.length-j-1][i];
            }
        }
        return newArray;
    }
    public static void rotate2(int[][] matrix){             // takes less space.
        int n = matrix.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        System.out.println(Arrays.deepToString(rotate(arr)));

        rotate2(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
