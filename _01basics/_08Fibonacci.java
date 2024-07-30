package _01basics;
import java.util.Scanner;

public class _08Fibonacci {
    public static int fiboNum(int n){       // for nth fibonacci number.
        if(n < 2){
            return n;
        }

        int a = 0, b = 1, c;
        for(int i=2; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void fiboSeries(int n){       // for printing fibo series upto n.
        int a = 0, b = 1, c;
        if(n == 0){
            System.out.println(0);
        }
        else if(n==1){
            System.out.println(0 + " " + 1);
        }else{
            System.out.print(0 + " " + 1 + " ");
            for(int i=2; i<=n; i++){
                c = a + b;
                a = b;
                b = c;
                System.out.print(b + " ");
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num: ");
        int num = sc.nextInt();
        int ans = fiboNum(num);
        System.out.println(ans);

        fiboSeries(num);
    }
}
