package algo;
import java.util.*;

public class ThreeNumberSum {

    public static void main(String args[]) {
        List<Integer[]> l = threeNumberSum(new int[]{ 12, 3, 1, 2, -6, 5, -8, 6},0);
        for(Integer[] a : l){
            System.out.println("<" + a[0] + "," + a[1] + "," + a[2]);
        }
    }
    public static List<Integer[]> threeNumberSum(int[] a, int targetSum) {
        List<Integer[]> list = new ArrayList<>();
        for(int i = 0;i<a.length-2;i++){
            for(int j = i+1; j< a.length-1;j++){
                for(int k = j+1; k< a.length; k++){
                    if(a[i] + a[j] + a[k] == targetSum){
                        Integer A[] = new Integer[3];
                        A[0] = a[i]; A[1] = a[j]; A[2] = a[k];
                        Arrays.sort(A);
                        list.add(A);
                    }
                }
            }
        }
        Collections.sort(list, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                int a1 = o1[0]; int a2 = o1[1]; int a3 = o1[2];
                int b1 = o2[0]; int b2 = o2[1]; int b3 = o1[2];
                if(a1 > b1) return 1;
                if(a1 < b1) return -1;
                if(a1 == b1){
                    if(a2 > b2) return 1;
                    if(a2 < b2) return -1;
                    if(a2 == b2){
                        if(a3 > b3) return 1;
                        if(a3 < b3) return -1;
                    }
                }
                return 0;
            }
        });
        return list;
    }
}
