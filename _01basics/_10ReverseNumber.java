package _01basics;

// LeetCode 7
public class _10ReverseNumber {
    public static int reverse(int x) {
        long ans = 0;
        while(x != 0){
            int rem = x % 10;
            x = x/10;
            ans = ans*10 + rem;
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        int num = 46892;
        System.out.println(reverse(num));
    }
}
