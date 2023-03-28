package algo;

import java.util.Arrays;

public class Large3 {

        public static void main(String args[]){
            int V[] = findThreeLargestNumbers(new int[]{141,1,17,-7,-17,-27,18,541,8,7,7});
            Arrays.stream(V).forEach(System.out::println);
        }
        public static int[] findThreeLargestNumbers(int[] a) {
            int r[] = new int[3];
            for (int i = 0; i < r.length; i++) {
                int pos = 0;
                int val = a[0];
                for (int j = 1; j < a.length; j++) {
                    if (a[j] > val) {
                        val = a[j];
                        pos = j;
                    }
                }
                r[i] = val;
                a[pos] = Integer.MIN_VALUE;
            }
            return r;
        }
}
