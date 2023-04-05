package algo;

import java.util.*;

public class PowerSetNonRecursion {

    public static List<List<Integer>> powerset(List<Integer> a) {
        int n = (int)Math.pow(2,a.size());
        List<List<Integer>> global = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int no = i;
            int x = 1;
            List<Integer> l = new ArrayList<>();
            global.add(l);
            while(no > 0){
                int mod = no % 2;
                if(mod == 1){
                    l.add(a.get(a.size()-x));
                }
                x++;
                no = no / 2;
            }
        }
        return global;
    }

    public static void main(String args[]){
        List<Integer> l = new ArrayList<>();
        l.add(1);l.add(2);l.add(3);
        List<List<Integer>> o = new PowerSetNonRecursion().powerset(l);
        for(List<Integer> x : o){
            System.out.print("[ ");
            for(Integer a : x){
                System.out.print(a + " ");
            }
            System.out.println("] ");
        }
    }
}
