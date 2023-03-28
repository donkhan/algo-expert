package algo;

import java.util.*;

public class MoveElementToLast {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(2);list.add(1);list.add(2);list.add(2);list.add(2);list.add(3);list.add(4);list.add(2);
        moveElementToEnd(list,2);
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i) + "  ");
        }
    }
    public static List<Integer> moveElementToEnd(List<Integer> a, int toMove) {
        // Write your code here.
        int s = 0;
        int l = a.size() - 1;
        for(int i = 0;i<a.size();i++){
            if(a.get(i) != 2) continue;
            while(l > i && a.get(l) == 2) l--;
            int t = a.get(i);
            a.set(i,a.get(l));
            a.set(l,t);
        }
        return a;
    }
}