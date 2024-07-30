package _05Arrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(!ans.isEmpty() && end <= ans.getLast()[1]){
                continue;
            }
            for (int j = i+1; j < intervals.length; j++) {
                if(intervals[j][0] <= end){
                    end = Math.max(end, intervals[j][1]);
                }else{
                    break;
                }
            }
            ans.add(new int[]{start, end});
        }
        return ans.toArray(new int[0][]);
    }

    public static int[][] merge2(int[][] intervals) {       // optimal.
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);

        List<int[]> ans = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            if(ans.isEmpty() || ans.getLast()[1] < intervals[i][0]){
                ans.add(intervals[i]);
            }else{
                ans.getLast()[1] = Math.max(ans.getLast()[1], intervals[i][1]);
            }
        }
        return ans.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }
}
