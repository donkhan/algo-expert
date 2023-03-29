package algo;

import java.util.*;

public class ProductSum {

    static int level = 1;
    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    public static int productSum(List<Object> array) {
        // Write your code here.
        int sum = 0;
        for(int i = 0;i<array.size();i++){
            Object element = array.get(i);
            if(element instanceof  Integer){
                sum += ((Integer) element).intValue();
            }else {
                level = level + 1;
                int v = productSum((List<Object>) element);
                sum += (level * v);
                level = level - 1;
            }
        }
        return sum;
    }

    public static void main(String args[]){
        List<Object> array = new ArrayList<>();
        array.add(5); array.add(2);
        List<Object> a1 = new ArrayList<>();
        a1.add(7); a1.add(-1);
        array.add(a1);
        array.add(3);
        List<Object> a2 = new ArrayList<>();
        a2.add(6);
        List<Object> a3 = new ArrayList<>();
        a3.add(-13);
        a3.add(8);
        a2.add(a3);
        a2.add(4);
        array.add(a2);
        System.out.println(productSum(array));
    }
}
