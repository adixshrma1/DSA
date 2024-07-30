package _01basics;

public class _01Sum {
//    public static double sum(double a, double b){
//        return a + b;
//    }

    public static double sum(double... numbers){    // varargs.
        double sum = 0;
        for(double num: numbers){
            sum = sum + num;
        }
        return sum;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter two numbers:");
//        double num1 = sc.nextDouble();
//        double num2 = sc.nextDouble();
//        double ans = sum(num1, num2);
//        System.out.println(ans);

        double ans = sum(1,2,3,4,5,6,7,8,9);
        System.out.println(ans);


    }
}