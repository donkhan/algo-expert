package algo;
import java.util.*;

public class Permutation {



    private static List<List<Integer>> p(List<Integer> in){
        List<List<Integer>> out = new ArrayList<>();
        if(in.size() == 1) {
            List<Integer> l = new ArrayList<>();
            l.add(in.get(0));
            out.add(l);
            return out;
        }

        int factorial = factorial(in.size());
        int rows = factorial/in.size();
        for(int k = 0;k<in.size();k++) {
            for (int i = 0; i < rows; i++) {
                List<Integer> newIn = new ArrayList();
                newIn.addAll(in.subList(0, k));
                newIn.addAll(in.subList(k + 1, in.size()));
                List<List<Integer>> newOut = p(newIn);
                for (List<Integer> xout : newOut) {
                    List<Integer> list = new ArrayList<>();
                    int y = in.get(k);
                    list.add(y);
                    for (int xx : xout) {
                        list.add(xx);
                    }
                    out.add(list);
                    i++;
                }
            }
        }
        return out;
    }

    private static int factorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();

        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        List<List<Integer>> x = p(list);
        for(List<Integer> y : x)
            System.out.println(y);
        System.out.println(x);
        System.out.println(x.size());
    }
}
