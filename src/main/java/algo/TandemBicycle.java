package algo;

import java.util.Arrays;

public class TandemBicycle {


    public int tandemBicycle(int[] red, int[] blue, boolean fastest) {
        // Write your code here.
        Arrays.sort(red);
        Arrays.sort(blue);
        int passes = red.length;
        int pass = 0;
        int ri = red.length-1;
        int bi = blue.length-1;
        int rs = 0;
        int bs = 0;
        int total = 0;
        if(fastest) {
            while (pass < passes) {
                if (red[ri] > blue[bi]) {
                    total = total + red[ri];
                    blue[bs] = 0;
                    red[ri] = 0;
                    ri--;
                    bs++;
                } else {
                    total = total + blue[bi];
                    red[rs] = 0;
                    blue[bi] = 0;
                    bi--;
                    rs++;
                }
                pass++;
            }
        }else{
            while (pass < passes) {
                if (red[ri] > blue[bi]) {
                    total = total + red[ri];
                    blue[bi] = 0;
                    red[ri] = 0;
                    ri--;
                    bi--;
                } else {
                    total = total + blue[bi];
                    red[ri] = 0;
                    blue[bi] = 0;
                    bi--;
                    ri--;
                }
                pass++;
            }
        }
        return total;
    }

    public static void main(String args[]){
        //System.out.println(new TandemBicycle().tandemBicycle(new int[]{5,5,3,9,2}, new int[]{3,6,7,2,1}, true));
        System.out.println(new TandemBicycle().tandemBicycle(new int[]{5,5,3,9,2}, new int[]{3,6,7,2,1}, false));
    }
}
