package _10Recursion;

import java.util.List;
import java.util.ArrayList;
public class _03StringQues {

    // we have to skip a characters from string.
    static String skip(String str, char ch, int index, String ans){
        if(index == str.length()) return ans;
        if(str.charAt(index) != ch){
            ans += str.charAt(index);
        }
        return skip(str, ch, index+1, ans);
    }
    static void skip2(String str,char ch, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(0) != ch){
            skip2(str.substring(1), ch, ans + str.charAt(0));
        }else {
            skip2(str.substring(1), ch, ans);
        }
    }
    static String skip3(String str){
        if(str.isEmpty()) return "";
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip3(str.substring(1));
        }else{
            return ch + skip3(str.substring(1));
        }
    }

    // skip a string from a string.
    static String skipString(String str, String skip){
        if(str.isEmpty()) return "";
        char ch = str.charAt(0);
        if(str.startsWith(skip)){
            return skipString(str.substring(skip.length()), skip);
        }else{
            return ch + skipString(str.substring(1), skip);
        }
    }

    // skip app but not apple.
    static String skipString1(String str){
        if(str.isEmpty()) return "";
        char ch = str.charAt(0);
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipString1(str.substring(3));
        }else{
            return ch + skipString1(str.substring(1));
        }
    }

    // finding subsets
    static void subset(String str, String ans){
        if(str.isEmpty()){
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(0);
        subset(str.substring(1), ans + ch);
        subset(str.substring(1), ans);
    }

    static List<String> subset2(String str, String ans, List<String> list){
        if(str.isEmpty()){
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        subset2(str.substring(1), ans + ch, list);
        subset2(str.substring(1), ans, list);
        return list;
    }
    static List<String> subset3(String str, String ans){
        List<String> list = new ArrayList<>();
        if(str.isEmpty()){
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        list.addAll(subset3(str.substring(1), ans + ch));
        list.addAll(subset3(str.substring(1), ans));
        return list;
    }

    // here we have to return List<List<Integer>> that contain power set of arr. (we can also use bit manipulation method)
    public static List<List<Integer>> subset4(int[] arr){        // recursive method.
        List<List<Integer>> ans = new ArrayList<>();
        generateSubsets(arr, 0, new ArrayList<>(), ans);
        return ans;
    }
    private static void generateSubsets(int[] arr, int index, List<Integer> list, List<List<Integer>> ans){
        if(index == arr.length){
            ans.add(new ArrayList<>(list));     // here we are adding a copy of 'list', not reference (ans.add(list)).
            return;                             // this will ensure that future modification will not affect the "ans" list.
        }
        int element = arr[index];
        list.add(element);
        generateSubsets(arr, index+1, list, ans);

        list.remove(list.size()-1);
        generateSubsets(arr, index+1, list, ans);
    }

    public static List<List<Integer>> subset5(int[] arr){   // iterative method.
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for (int i = 0; i < arr.length; i++) {
            int n = ans.size();
            for (int j = 0; j < n; j++) {
                List<Integer> internal = new ArrayList<>(ans.get(j));
                internal.add(arr[i]);
                ans.add(internal);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aditya sharma";
//        System.out.println(skip(str, 'a', 0, ""));
//        skip2(str, 'a', "");
//        System.out.println(skip3(str));
//        System.out.println(skipString("Not app Eat apple", "apple"));
//        System.out.println(skipString1("skip app but not apple"));

//        subset("abc", "");
//        System.out.println(subset2("abc", "", new ArrayList<>()));
//        System.out.println(subset3("abc", ""));
//        System.out.println(subset4(new int[]{1,2,3}));

        System.out.println(subset5(new int[]{1,2,3}));
    }
}
