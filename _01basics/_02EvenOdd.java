package _01basics;

import java.util.Scanner;
import java.util.ArrayList;

public class _02EvenOdd {
    public static ArrayList<Integer> allEven(int start, int end){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if(i%2 == 0){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an Integer number:");
//        int num = sc.nextInt();
//        if(num % 2 == 0){
//            System.out.println("even number");
//        } else{
//            System.out.println("odd number");
//        }

        ArrayList<Integer> list = allEven(45,90);
        System.out.println(list);
    }
}
