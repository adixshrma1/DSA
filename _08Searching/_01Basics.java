package _08Searching;

public class _01Basics {
    public static int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int m = (s + e)/2;
            if(arr[m] < key){
                s = m+1;
            }else if(arr[m] > key){
                e = m-1;
            }else{
                return m;
            }
        }
        return -1;
    }
    public static int binaryRecursive(int[] arr, int key, int s, int e){
        int m = (s+e)/2;
        if(arr[m] < key) return binaryRecursive(arr, key, m+1, e);
        else if(arr[m] > key) return binaryRecursive(arr, key, s, m-1);
        else return m;
    }
    public static void main(String[] args) {
//        int[] nums = {10,11,12,13,46,52,95,36,78};
//        System.out.println(linearSearch(nums, 95));

        int[] nums2 = {1,2,3,5,7,9,16,17,19,25};
//        System.out.println(binarySearch(nums2, 95));
//        System.out.println(binarySearch(nums2, 25));

        System.out.println(binaryRecursive(nums2, 25, 0,nums2.length-1));
    }
}
