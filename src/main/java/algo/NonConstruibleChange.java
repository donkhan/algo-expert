package algo;

import java.util.Arrays;

public class NonConstruibleChange {

    public int nonConstructibleChange(int[] coins) {
        int change = 20;
        while(true) {
            int lc = change;
            int[] backup = new int[coins.length];
            for (int i = 0; i < coins.length; i++) backup[i] = coins[i];
            Arrays.sort(coins);
            while(lc >= 1) {
                int index = -1;
                int diff = Integer.MAX_VALUE;
                for(int i = 0;i<coins.length;i++){
                    if(coins[i] == 0)continue;
                    int ldiff = lc - coins[i];
                    if(ldiff >= 0){
                        if(ldiff < diff) diff = ldiff;
                        index = i;
                    }
                }
                if(index == -1) break;
                lc = lc - coins[index];
                coins[index] = 0;
            }

            for(int i = 0;i<coins.length;i++) coins[i] = backup[i];
            if(lc != 0) break;
            System.out.println("Passed " + change);
            change++;
        }
        return change;
    }

    public static void main(String args[]){
        System.out.println(new NonConstruibleChange().nonConstructibleChange(new int[]{5,7,1,1,2,3,22}));
    }
}
