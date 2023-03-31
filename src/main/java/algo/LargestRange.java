package algo;

import java.util.Arrays;

public class LargestRange {

    private static boolean isPresent(int[] a, int p){
        for(int i = 0;i<a.length;i++){
            if(a[i] == p) return true;
        }
        return false;
    }

    public static int[] largestRange(int[] a) {
        // Write your code here.
        Arrays.sort(a);
        int ml = -1; int mrs = -1; int mre = -1;
        int i = 0;
        int rs = a[i];
        int re = a[i];
        while(i < a.length-1){
            i = i + 1;
            if(a[i] == a[i-1]) continue;
            if(a[i] == a[i-1]+1){
                re = a[i];
            }else{
                //System.out.println(rs + "  " + re);
                if(re-rs > ml){
                    ml = re - rs;
                    mrs = rs;
                    mre = re;
                }
                rs = a[i];
                re = a[i];
            }
        }
        if(re-rs > ml){
            ml = re - rs;
            mrs = rs;
            mre = re;
        }
        System.out.println(mrs + "  " + mre);
        int o[] = new int[2];
        o[0] = mrs; o[1] = mre;
        return o;
    }

    public static void main(String args[]){
        //largestRange(new int[]{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6});
        largestRange(new int[]{19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14});
    }
}
