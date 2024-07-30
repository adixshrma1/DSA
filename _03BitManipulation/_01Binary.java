package _03BitManipulation;

public class _01Binary {
    public static String decimalToBinary(int n){    // decimal to binary
        String str = "";
        while(n>0){
            int rem = n%2;
            n=n/2;
            str = rem + str;
        }
        return str;
    }
    public static int binaryToDecimal(String str){
        int sum = 0;
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        for (int i = 0; i < str.length(); i++) {
            char ch = rev.charAt(i);
            int num = Character.getNumericValue(ch);
            num = num * (int)Math.pow(2, i);
            sum = sum + num;
        }
        return sum;
    }
    public static void main(String[] args) {
//        System.out.println(decimalToBinary(7));
//        System.out.println(decimalToBinary(45));
//        System.out.println(decimalToBinary(8));

        System.out.println(binaryToDecimal("1101"));
        System.out.println(binaryToDecimal("1111"));
    }
}