package _08Searching;

public class _06MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {     // brute force accepted. TC- O(n + m), SC- O(n+m)
        int m = nums1.length;
        int n = nums2.length;
        int[] mix = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                mix[k] = nums1[i];
                i++;
            }else{
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m){
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            mix[k] = nums2[j];
            j++;
            k++;
        }
        double median = 0;
        if(mix.length % 2 == 0){
            int first = mix.length/2 -1;
            int second = mix.length/2;
            median = ((double)mix[first] + (double)mix[second])/2;
        }else{
            int first = mix.length/2;
            median = mix[first];
        }
        return median;
    }
    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {        // without using extra space. O(m + n)
        int m = nums1.length;
        int n = nums2.length;
        int ind2 = (m + n)/2;
        int ind1 = ind2-1;
        int i = 0;
        int j = 0;
        int indexCount = 0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                if(indexCount == ind1) element1 = nums1[i];
                else if(indexCount == ind2) element2 = nums1[i];
                i++;
                indexCount++;
            }else{
                if(indexCount == ind1) element1 = nums2[j];
                else if(indexCount == ind2) element2 = nums2[j];
                j++;
                indexCount++;
            }
        }
        while(i < m){
            if(indexCount == ind1) element1 = nums1[i];
            else if(indexCount == ind2) element2 = nums1[i];
            i++;
            indexCount++;
        }
        while(j < n){
            if(indexCount == ind1) element1 = nums2[j];
            else if(indexCount == ind2) element2 = nums2[j];
            j++;
            indexCount++;
        }
        if((m+n)%2 == 1){
            return element2;
        }else{
            return ((double)element1 + (double)element2)/2;
        }
    }
    // Learn optimal solution when revising.
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
        System.out.println(findMedianSortedArrays2(nums1, nums2));
    }
}
