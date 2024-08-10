package _10Recursion;

import java.util.ArrayList;
import java.util.List;

public class _02ArrayQues {
    public static boolean isSorted(int[] arr, int index){   // recursive.
        if(index == arr.length-1) return true;

        if(arr[index] < arr[index+1]){
            return isSorted(arr, index+1);
        }else{
            return false;
        }
    }

    public static int linearSearch(int[] arr, int key, int index){      // recursive.
        if(index == arr.length) return -1;
        if(arr[index] == key) return index;

        return linearSearch(arr, key, index+1);
    }

    public static List<Integer> linearSearch1(int[] arr, int key, int index, List<Integer> ans){      // Multiple occurrence
        if(index == arr.length) return ans;
        if(arr[index] == key){
            ans.add(index);
        }
        return linearSearch1(arr, key, index+1, ans);
    }

    public static List<Integer> linearSearch2(int[] arr, int key, int index){      // we are creating list inside.
        List<Integer> ans = new ArrayList<>();
        if(index == arr.length) return ans;
        if(arr[index] == key){
            ans.add(index);
        }
        ans.addAll(linearSearch2(arr, key, index+1));
        return ans;
    }

    public static int rotatedBS(int[] arr, int key, int s, int e){
        if(s > e) return -1;
        int mid = (s+e)/2;
        if(arr[mid] == key) return mid;

        if(arr[s] <= arr[mid]){
            if(arr[s] <= key && key < arr[mid]){
                return rotatedBS(arr, key, s, mid-1);
            }else{
                return rotatedBS(arr, key, mid+1, e);
            }
        }else{
            if(arr[mid] < key && key <= arr[e]){
                return rotatedBS(arr, key, mid+1, e);
            }else{
                return rotatedBS(arr, key, s, mid-1);
            }
        }
    }

    public static void pattern(int n){
        if(n == 0) return;
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern(n-1);
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,3,5,9,14};
//        System.out.println(isSorted(arr, 0));

//        System.out.println(linearSearch(arr, 5, 0));

//        int[] arr1 = {1,2,3,5,5,9,14,5};
//        System.out.println(linearSearch1(arr1, 5, 0, new ArrayList<>()));

//        System.out.println(linearSearch2(arr1, 5, 0));

//        int[] arr2 = {5,6,7,8,9,1,2,3,4};
//        System.out.println(rotatedBS(arr2, 100, 0, arr2.length-1));
//        System.out.println(rotatedBS(arr2, 5, 0, arr2.length-1));
//        System.out.println(rotatedBS(arr2, 4, 0, arr2.length-1));

//        pattern(5);
    }
}
