package _10Recursion;

import java.util.ArrayList;
import java.util.List;

public class _04Permutation {
    static void permutation(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutation(up.substring(1), f + ch + s);
        }
    }
    static List<String> permutation1(String up, String p){
        List<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            list.addAll(permutation1(up.substring(1), f + ch + s));
        }
        return list;
    }
    public static void main(String[] args) {
//        permutation("abcd","");
        System.out.println(permutation1("abc", ""));
    }
}
