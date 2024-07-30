package _01basics;

import java.util.Scanner;

// HCF (highest common factor), GCD (greatest common divisor) are same thing.
// meaning:- highest number that can divide both the numbers.

// Euclid's algo: hcf(a, b) = hcf((b,a), a)

// LCM (lowest common multiple)
// lcm(a,b) = a*b/hcf(a,b)

public class _04HCFnLCM {
    public static int HCF(int a, int b){        // try on pen and paper to confirm.
        if(a == 0){
            return b;
        }
        return HCF((b%a), a);
    }
    public static int LCM(int a, int b){
        return a*b/HCF(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two integers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = HCF(num1, num2);
        int lcm = LCM(num1, num2);

        System.out.println("HCF of given numbers is: " + hcf);
        System.out.println("LCM of given numbers is: " + lcm);
    }
}
