package _06Arrays3;

public class _01SearchIn2Dmatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n -1;

        while(start <= end){
            int mid = (start+end)/2;
            int row = mid / n;
            int col = mid % n;
            if(matrix[row][col] < target){
                start = mid + 1;
            } else if(matrix[row][col] > target){
                end = mid - 1;
            } else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,5},
                {7,9,11,12},
                {13,15,19,20}
        };
        System.out.println(searchMatrix(matrix, 12));
    }
}
