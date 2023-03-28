package algo;

import java.util.*;

public class FirstDuplicateValue {

    public static void main(String args[]){
        int a[] = {2,1,5,2,3,3,4};
        int x = solve(a);
        System.out.println(x);
    }

    private static int solve(int a[]){
        Set<Integer> set = new HashSet();
        for(int i = 0;i<a.length;i++){
           if(set.contains(a[i])) return a[i];
           set.add(a[i]);
        }
        return -1;
    }
}
