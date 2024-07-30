package _06Arrays3;

import java.util.Arrays;

public class _05UniquePaths {   // LC 62
    private static int recursive(int i, int j, int m, int n){       // (time limit exceeded) exponential TC
        if(i >= m || j >= n){
            return 0;
        }
        if(i == m-1 && j == n-1){
            return 1;
        }
        int left = recursive(i+1, j, m, n);
        int right = recursive(i, j+1, m, n);
        return left + right;
    }
    private static int dynamic(int i, int j, int m, int n, int[][] dp){
        if(i >= m || j >= n) return 0;
        if(i == m-1 && j == n-1) return 1;

        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = dynamic(i+1, j, m, n, dp) + dynamic(i, j+1, m, n, dp);
    }
    public static int uniquePaths1(int m, int n){
//        return recursive(0,0,m,n);  // recursive approach

        int[][] dp = new int[m][n];     // DP approach
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return dynamic(0, 0, m, n, dp);
    }

    // using combinations
    public static int uniquePaths2(int m, int n){
        int N = m+n-2;
        int r = m-1;

        double res = 1;
        for(int i=1; i<=r; i++){
            res = res * (N-r+i)/i;
        }
        return (int)(res);
    }
    public static void main(String[] args) {
//        System.out.println(uniquePaths1(3, 7));
        System.out.println(uniquePaths2(53,4));
    }
}
