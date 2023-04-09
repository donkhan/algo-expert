package algo;
import java.util.*;

public class RadixSort {

    private int getMax(List<Integer> list){
        int max = list.get(0);
        for(int m : list){
            if(m > max) max = m;
        }
        return max;
    }

    private int getDigits(int n){
        int d = 0;
        while(n > 0){
            n = n /10;
            d++;
        }
        return d;
    }
    public ArrayList<Integer> radixSort(ArrayList<Integer> array) {
        // Write your code here.
        if(array.size() == 0) return array;
        int d = getDigits(getMax(array));
        ArrayList<Integer> s = new ArrayList<>();
        int x = 1;
        while(d > 0) {
            array = countSort(array, x);
            x++;
            d--;
        }
        return array;
    }

    public ArrayList<Integer> countSort(ArrayList<Integer> array, int div) {
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> divList = new ArrayList<>();

        for(int i = 0;i<10;i++){
            divList.add(new ArrayList<Integer>());
        }
        for(int i = 0;i<array.size();i++){
            int v = array.get(i);
            int posValue = getPostionalValue(v,div);
            divList.get(posValue).add(i);
        }
        for(int i = 0;i<10;i++){
            List<Integer> indices = divList.get(i);
            for(int k : indices){
                list.add(array.get(k));
            }
        }
        return list;
    }

    private int getPostionalValue(int v, int div) {
        while(div > 1){
            v = v / 10;
            div--;
        }
        return v%10;
    }

    public static void main(String args[]) {
        t1();
        //int x = new RadixSort().getPostionalValue(100,3);
        //System.out.println(x);
    }

    private static void t8(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        print(new RadixSort().radixSort(list));
    }

    private static void t7(){
        ArrayList<Integer> list = new ArrayList<>();
        print(new RadixSort().radixSort(list));
    }

    private static void t2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(132);list.add(543);list.add(783);list.add(63);list.add(7);
        list.add(49);list.add(898);
        print(new RadixSort().radixSort(list));
    }

    private static void t1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8762);list.add(654);list.add(3008);list.add(345);list.add(87);
        list.add(65);list.add(234);list.add(12);list.add(2);
        print(new RadixSort().radixSort(list));
    }

    private static void print(List<Integer> a){
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
