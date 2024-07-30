package _01basics;
import java.util.Scanner;

public class _07Factorial {
    public static int factorial(int num){
        if(num == 0 || num == 1){
            return num;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Factorial is: " + factorial(num));
    }
}
