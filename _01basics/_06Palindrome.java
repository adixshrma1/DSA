package _01basics;
import java.util.Scanner;

public class _06Palindrome {
    public static String reverse(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            newStr = ch + newStr;
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        if(str.equals(reverse(str))){
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
