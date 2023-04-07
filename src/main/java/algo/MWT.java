package algo;

import java.util.Arrays;

public class MWT {


    public int minimumWaitingTime(int[] q) {
        // Write your code here.
        Arrays.sort(q);
        int w = 0;
        for(int i = 1;i<q.length;i++){
            w = w + addUpto(q,i);
        }
        return w;
    }

    private int addUpto(int[] q, int i) {
        int s = 0;
        for(int k = 0;k<i;k++){
            s = s + q[k];
        }
        return s;
    }

    public static void  main(String args[]){
        System.out.println(new MWT().minimumWaitingTime(new int[]{3,2,1,2,6}));
    }
}
