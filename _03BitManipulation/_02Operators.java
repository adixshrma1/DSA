package _03BitManipulation;
/* operators
    AND &
    OR |
    NOT !
    XOR ^
        1 ^ 1 = 0
        0 ^ 0 = 0
        1 ^ 0 = 1

        a ^ 1 = a compliment
        a ^ 0 = a
        a ^ a = 0
    Compliment ~
    Shift >>, <<
 */

public class _02Operators {
    public static boolean isSet(int num, int bit){
        num = num >> bit;
        return (num & 1) == 1;
    }
    public static int setBit(int num, int bit){
        int one = 1 << bit;
        return num | one;
    }
    public static int clearBit(int num, int bit){
        int one = 1 << bit;
        int compliment = ~one;
        return num & compliment;
    }
    public static int toggleBit(int num, int bit){
        int one = 1 << bit;
        return num ^ one;
    }
    public static int rmLastSetBit(int num){       // optimal
        return num & (num - 1);
    }
    public static void main(String[] args) {
//        // swapping without temp
//        int a = 40;
//        int b = 50;
//        System.out.println("the value of a is: " + a);
//        System.out.println("the value of b is: " + b);
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//        System.out.println(a);
//        System.out.println(b);

//        // check ith bit set or not
//        System.out.println(isSet(13,2));
//        System.out.println(isSet(11, 2));

//        // Set nth bit
//        System.out.println(setBit(13, 1));

//        // Clear bit
//        System.out.println(clearBit(13, 2));

        // toggle bit
//        System.out.println(toggleBit(13, 2));
//        System.out.println(toggleBit(13, 1));

        // rm last set bit.
        System.out.println(rmLastSetBit(5));
        System.out.println(rmLastSetBit(32));
        System.out.println(rmLastSetBit(15));
    }
}
