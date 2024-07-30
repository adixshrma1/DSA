package _02Patterns;

public class _02Patterns {
    public static void pat1(int n){     // triangle with spaces in front.
        for(int rows = 1; rows<=n; rows++){
            for(int space = 1; space<= n-rows; space++){
                System.out.print(" ");
            }
            for(int cols = 1; cols<= 2*rows-1; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat2(int n){     // triangle with spaces in front (inverted).
        for(int rows = 1; rows<=n; rows++){
            for(int space = 1; space <= rows-1; space++){
                System.out.print(" ");
            }
            for(int cols = 1; cols<= 2*n - (2*rows-1) ; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat3(int n){
        for(int rows = 1; rows<=n; rows++){
            for(int space = 1; space<= n-rows; space++){
                System.out.print(" ");
            }
            for(int cols = 1; cols<= 2*rows-1; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int rows = 1; rows<=n; rows++){
            for(int space = 1; space <= rows-1; space++){
                System.out.print(" ");
            }
            for(int cols = 1; cols<= 2*n - (2*rows-1) ; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2 == 0){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
    public static void pat5(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {      // for first number.
                System.out.print(j);
            }
            for (int j = 1; j <= 2*(n-i) ; j++) {        // for spaces.
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
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
