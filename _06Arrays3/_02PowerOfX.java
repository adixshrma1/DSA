package _06Arrays3;

public class _02PowerOfX {
    public static double myPow(double x, int n) {
        double ans = 1.0;
        long m = n;
        if(m < 0){
            m = m * (-1);
        }
        while(m>0){
            if(m%2 == 0){
                x = x * x;
                m = m/2;
            }else{
                ans = ans * x;
                m--;
            }
        }
        if(n<0){
            ans = 1.0/ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }
}
