package _08Searching;


// Problem link:- https://www.interviewbit.com/problems/allocate-books/
public class _08AllocateBooks {
    public static int books(int[] A, int B) {
        int start = 0;
        int end = 0;
        for (int element : A) {
            end = end + element;
        }
        int max = 0;
        while(start <= end){
            int mid = (start + end)/2;
            if(isAllocationPossible(A, B, mid)){
                max = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return max;
    }
    private static boolean isAllocationPossible(int[] A, int B, int val){
        int students = 1;
        int allocatedPages = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] > val) return false;
            if(allocatedPages + A[i] > val){
                students++;
                allocatedPages = 0;
            }
            allocatedPages += A[i];

        }
        return students <= B;
    }
    public static void main(String[] args) {
        int[] A = {12, 34, 67, 90};
        int B = 2;
        System.out.println(books(A, B));
    }
}
