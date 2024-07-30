package _02Patterns;

public class _03Patterns {
    public static void pat1(int n){
        int value = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
    public static void pat2(int n){
        int value = 64;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(value + j));
            }
            System.out.println();
        }
    }
    public static void pat3(int n){
        int value = 64;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print((char)(value + j));
            }
            System.out.println();
        }
    }
    public static void pat4(int n){
        int value = 64;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(value + i));
            }
            System.out.println();
        }
    }
    public static void pat5(int n){
        int value = 64;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i; j++) {    // for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(value + j));
            }
            for (int j = i-1; j >= 1; j--) {
                System.out.print((char)(value + j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        pat1(5);
//        pat2(5);
//        pat3(5);
//        pat4(5);
        pat5(5);
    }
}
