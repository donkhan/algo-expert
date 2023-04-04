package algo;

import java.util.*;

public class MergeOverlappingInterval {

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.

        for(int i = 0;i<intervals.length-1;i++){
            for(int j = i+1;j<intervals.length;j++){
                int[] interval_1 = intervals[i];
                int[] interval_2 = intervals[j];
                if(canMerge(interval_1,interval_2)){
                    int[] ninterval = merge(interval_1,interval_2);
                    int[][] nintervals = new int[intervals.length-1][2];
                    nintervals[0] = ninterval;
                    for(int k = 0,r = 1;k<intervals.length;k++){
                        if(k != j && k != i){
                            nintervals[r++] = intervals[k];
                        }
                    }
                    return mergeOverlappingIntervals(nintervals);
                }
            }
        }
        return intervals;
    }

    private boolean canMerge(int[] i1, int[] i2) {
        int lower_bound = i1[0];
        if(lower_bound >= i2[0] && lower_bound <= i2[1]) return true;
        lower_bound = i2[0];
        if(lower_bound >= i1[0] && lower_bound <= i1[1]) return true;
        return false;
    }

    private int[] merge(int[] i1, int[] i2){
        int[] n = new int[2];
        int t = i1[0];
        if(i2[0] < t) t = i2[0];
        n[0] = t;
        t = i1[1];
        if(i2[1] > t) t = i2[1];
        n[1] = t;
        return n;
    }

    public static void main(String args[]) {
        executeAndPrint(t2());
    }

    private static int[][] t1(){
        int[][] intervals = {
                {1,2},{3,5},{4,7},{6,8},{9,10}
        };
        return intervals;
    }

    private static int[][] t2(){
        int[][] intervals = {
                {100,105}, {1,104}
        };
        return intervals;
    }

    private static void executeAndPrint(int[][] intervals){
        intervals = new MergeOverlappingInterval().mergeOverlappingIntervals(intervals);
        for(int[] interval : intervals){
            System.out.println(interval[0] + "  " + interval[1]);
        }
    }
}
