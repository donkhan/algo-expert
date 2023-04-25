package experiment;

import java.util.*;

public class P2 {

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        // Write your code here.
        ArrayList<List<Integer>> x = new ArrayList<>();
        if(array.size() == 1){
            x.add(array);
            return x;
        }
        for(int i = 0;i<array.size();i++){
            List<Integer> r = new ArrayList<>();
            for(int k = 0;k<i;k++){
                r.add(array.get(k));
            }
            for(int k = i+1;k<array.size();k++){
                r.add(array.get(k));
            }
            int ele = array.get(i);

            List<List<Integer>> output = getPermutations(r);
            for(int k = 0;k<output.size();k++){
                List<Integer> l = new ArrayList<>();
                l.add(ele);
                l.addAll(output.get(k));
                x.add(l);
            }
        }
        return x;
    }

    public static void main(String args[]){
        List<Integer> l = new ArrayList<>();
        l.add(1);l.add(2);l.add(3);l.add(4);
        List<List<Integer>> output = getPermutations(l);
        System.out.println("Size " + output.size());
        for(List<Integer> o : output){
            for(Integer i : o){
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }


}
