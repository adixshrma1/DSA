package _05Arrays2;

import java.util.Arrays;

public class _06CountInversions {
    public static int getInversions1(int arr[], int n) {      // brute force.
        int count = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    static int mergeSort1(long[] arr, int s, int e){        // in line sorting
        int count = 0;
        if(s == e){
            return count;
        }
        int m = (s + e) / 2;
        count += mergeSort1(arr, s, m);
        count += mergeSort1(arr, m+1, e);

        count += merge1(arr, s, m, e);
        return count;
    }
    private static int merge1(long[] arr, int s, int m, int e) {
        long [] mix = new long[e-s+1];
        int i = s;
        int j = m+1;
        int k = 0;

        int count = 0;
        while(i <= m && j <= e){
            if(arr[i] <= arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
                count += (m-i+1);
            }
            k++;
        }
        while(i <= m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j <= e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length ; l++) {
            arr[s+l] = mix[l];
        }
        return count;
    }
    public static long getInversions(long arr[], int n) {
        long ans = (long)mergeSort1(arr, 0, n-1);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {5,3,2,4,1};
        System.out.println(getInversions1(arr1, 5));

        long[] arr2 = {5,3,2,4,1};
        System.out.println(mergeSort1(arr2, 0, arr2.length-1));
        System.out.println(Arrays.toString(arr2));
    }
}
