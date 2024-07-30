package _08Searching;

// Problem Link: https://www.naukri.com/code360/problems/1062679?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTabValue=PROBLEM
public class _02NthRootOfM {
    public static int NthRoot(int n, int m) {
        int s = 1;
        int e = m;
        while(s <= e){
            int mid = (s+e)/2;
            if(Math.pow(mid, n) > m){
                e = mid - 1;
            }else if(Math.pow(mid, n) < m){
                s = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(NthRoot(3, 27));
        System.out.println(NthRoot(5, 32));
    }
}
