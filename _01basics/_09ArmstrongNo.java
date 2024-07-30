package _01basics;

public class _09ArmstrongNo {
    public static boolean isArmstrong(int n){
        int original = n;
        int digits = (int)((Math.log10(n)) + 1);
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = (int) (sum + Math.pow(rem, digits));
        }
        return original == sum;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(9474));
        for (int i = 1; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
}
