package _01basics;

import java.util.Scanner;

public class _03MultiTable {
    public static void findTable(int num){
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        findTable(33);
    }
}
