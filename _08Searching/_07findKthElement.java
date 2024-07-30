package _08Searching;

public class _07findKthElement {    // find kth element of two sorted arrays.
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        long[] mix = new long[n+m];
        int i = 0;
        int j = 0;
        int l = 0;
        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                mix[l] = arr1[i];
                i++;
            }else{
                mix[l] = arr2[j];
                j++;
            }
            l++;
        }
        while(i < n){
            mix[l] = arr1[i];
            i++;
            l++;
        }
        while(j < m){
            mix[l] = arr2[j];
            j++;
            l++;
        }
        return mix[k-1];
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        System.out.println(kthElement(arr1, arr2, 5, 4, 5));
    }
}
