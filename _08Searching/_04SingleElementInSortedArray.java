package _08Searching;

public class _04SingleElementInSortedArray {
    public static int xorMethod(int[] arr){     // brute force. O(n)
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor^arr[i];
        }
        return xor;
    }
    public static int singleElement(int[] arr){     // optimal.
        int low = 0;
        int high = arr.length-2;    // second last index.
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == arr[mid^1]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return arr[low];
    }
    // if a number is even and you xor it with 1, it will give number+1 (next odd)
    // and if a number is odd it will give number-1 (previous even)
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleElement(arr));
    }
}
