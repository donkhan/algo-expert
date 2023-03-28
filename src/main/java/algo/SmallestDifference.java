package algo;
import java.util.*;

public class SmallestDifference {

        public static void main(String args[]) {
            int a[] = smallestDifference(new int[]{-1,5,10,20,28,3}, new int[]{26,134,135,15,17});
            System.out.println(a[0] + "  " + a[1]);
        }

        public static int[] smallestDifference(int[] a1, int[] a2) {
            // Write your code here.
            int sd = Integer.MAX_VALUE;
            int a = 0, b = 0;
            for(int i = 0;i<a1.length;i++) {
                for(int j = 0;j<a2.length;j++) {
                    int diff = Math.abs(a1[i]-a2[j]);
                    if(diff < sd){
                        sd = diff;
                        a = a1[i];
                        b = a2[j];
                    }
                }
            }

            return new int[] {a,b};
        }
    }


