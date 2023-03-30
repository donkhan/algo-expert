package algo;

import java.util.*;

public class FourNumberSum {
    public static void main(String args[]) {
        List<Integer[]> l = fourNumberSum(new int[]{ 12, 3, 1, 2, -6, 5, -8, 6},0);
        for(Integer[] a : l){
            System.out.println("<" + a[0] + "," + a[1] + "," + a[2] + "," + a[3] + ">");
        }
    }
    public static List<Integer[]> fourNumberSum(int[] a, int targetSum) {
        List<Integer[]> list = new ArrayList<>();
        for(int i = 0;i<a.length-3;i++){
            for(int j = i+1; j< a.length-2;j++) {
                for (int k = j + 1; k < a.length - 1; k++) {
                    for (int l = k + 1; l < a.length; l++) {
                        if (a[i] + a[j] + a[k] + a[l] == targetSum) {
                            Integer A[] = new Integer[4];
                            A[0] = a[i];
                            A[1] = a[j];
                            A[2] = a[k];
                            A[3] = a[l];
                            list.add(A);
                        }
                    }
                }
            }
        }
        return list;
    }


}
