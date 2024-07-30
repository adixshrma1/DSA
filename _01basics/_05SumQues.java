package _01basics;
// Question: Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class _05SumQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("enter a number (or x to quite)");
            String num = sc.next();
            if(num.equals("x")){    // String values are compared using ".equals"
                break;
            }
            try{
                int IntNumber = Integer.parseInt(num);
                sum = sum + IntNumber;
            } catch(NumberFormatException e){
                System.out.println("Please either enter a number or character 'x'");
            }
        }
        System.out.println(sum);
    }
}
