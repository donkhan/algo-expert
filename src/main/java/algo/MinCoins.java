package algo;
import java.util.*;

public class MinCoins {

    private static int min(int x,int y){
        if(x == -1) return y;
        int t = x;
        if(t > y) t= y;
        return t;
    }
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        // Write your code here.
        if(n == 0) return 0;
        Arrays.sort(denoms);
        int d[][] = new int[denoms.length][n+1];
        for(int i = 0;i<denoms.length;i++){
            int rr = i;
            for(int j = 0;j<=n;j++) {
                //System.out.print("(" + i + "," + j + ")");
                if(j == 0){
                    d[i][j] = 0;
                    continue;
                }
                if(j < denoms[i]){
                    if(i == 0){
                        d[i][j] = -1;
                        continue;
                    }
                    d[i][j] = d[i-1][j];
                    continue;
                }
                int r = j-denoms[i];
                if(r < 0){
                    d[i][j] = -1;
                    continue;
                }
                if(d[i][r] == -1){
                    d[i][j] = -1;
                    if(i != 0) {
                        if (d[i - 1][j] != -1) d[i][j] = d[i - 1][j];
                    }
                    continue;
                }
                int coins = 1 + d[i][r];
                if(i != 0) {
                    d[i][j] = min(d[i-1][j],coins);
                }else{
                    d[i][j] = coins;
                }
            }
        }
        int r = d[denoms.length-1][n];
        return r;
    }

    public static void main(String args[]){
        t13();

    }

    private static void t11() {
        System.out.println(minNumberOfCoinsForChange(7,new int[]{2,4}));
    }

    private static void t12() {
        System.out.println(minNumberOfCoinsForChange(7,new int[]{3,7}));
    }

    private static void t13() {
        System.out.println(minNumberOfCoinsForChange(9,new int[]{3,5}));
    }

    private static void t1() {
        System.out.println(minNumberOfCoinsForChange(7,new int[]{1,5,10}));
    }

    private static void t2(){
        System.out.println(minNumberOfCoinsForChange(11,new int[]{1,5,6,8}));
    }
}
