package _02Patterns;

public class _04Patterns {
    public static void pat1(int n){
        int value = 70;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print((char)(value - j));
            }
            System.out.println();
        }
    }
    public static void pat2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i+1; j++) {      // for first star.
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(i-1); j++) {       // for spaces.
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i+1; j++) {      // for second star.
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {      // for first star.
                System.out.print("*");
            }
            for (int j = 1; j <= 2*n - 2*i; j++) {       // for spaces.
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {      // for second star.
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat3(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {      // for first star.
                System.out.print("*");
            }
            for (int j = 1; j <= 2*n - 2*i; j++) {       // for spaces.
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {      // for second star.
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i; j++) {      // for first star.
                System.out.print("*");
            }
            for (int j = 1; j <= 2*i; j++) {       // for spaces.
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i; j++) {      // for second star.
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pat4(int n){     // hollow square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==1 || i==n|| j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pat5(int n){     // complex
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                int left = j-1;
                int right = 2*n-1-j;
                int top = i-1;
                int bottom = 2*n-1-i;
                System.out.print(n - Math.min(Math.min(left, right), Math.min(top, bottom)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        pat1(5);
//        pat2(5);
//        pat3(5);
//        pat4(5);
        pat5(4);
    }
}
