package _10Recursion;
// how to approach a recursion problem.
// step 1: Identify if you can break problem into sub problems.
// step 2: Write recursion relation if needed.
// step 3: Draw recursive tree, see its flow.
//          -use debugger to see the flow, how functions are getting in stack.
// step 4: Identify the base condition.
// step 5: See how the values are being returned.
// step 6: Identify the variables need to be passed inside arguments of function.
//          -variables that are specific to that function call should remain in body of function.
//          -variables you needed to pass inside future function calls should be passed inside argument of function.

public class _01Basics {
    public static int nthFibo(int n){
        if(n == 0 || n == 1) return n;
        return nthFibo(n-1) + nthFibo(n-2);
    }
    public static int binarySearch(int[] arr, int key, int s, int e){
        if(s > e) return -1;
        int mid = (s + e)/2;
        if(arr[mid] > key){
            return binarySearch(arr, key, s, mid-1);
        }
        else if(arr[mid] < key){
            return binarySearch(arr, key, mid+1, e);
        }
        return mid;
    }

    // reverse a number.
    public static int reverse(int num){     // iterative
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        return rev;
    }

    public static int reverse1(int num, int rev){   // recursion
        if(num == 0) return rev;
        int rem = num % 10;
        return reverse1(num / 10, rev*10 + rem);
    }

    public static int sumOfDigits(int num){
        if(num == 0) return 0;
        return num % 10 + sumOfDigits(num / 10);
    }
    public static int prodOfDigits(int num){
        if(num % 10 == num) return num;
        return num % 10 * prodOfDigits(num / 10);
    }

    public static int countZeros(int num, int count){
        if(num == 0) return count;
        if(num % 10 == 0) count++;
        return countZeros(num / 10, count);
    }

    // count the number of steps to reduce a number to zero.
    // leetCode 1342.
    static int countSteps(int num, int count){
        if(num == 0) return count;

        if(num % 2 == 0){
            return countSteps(num/2, count + 1);
        }else{
            return countSteps(num -1, count + 1);
        }
    }
    public static void main(String[] args) {
//        System.out.println(nthFibo(6));
        int[] nums = {1,3,4,5,6,8,9};
        System.out.println(binarySearch(nums, 8, 0, nums.length-1));


//        System.out.println(reverse(-123));
//        System.out.println(reverse(123));

//        System.out.println(reverse1(-123, 0));
//        System.out.println(reverse1(123, 0));

//        System.out.println(sumOfDigits(-331));

//        System.out.println(prodOfDigits(1234));

        System.out.println(countZeros(100000300, 0));
    }
}
