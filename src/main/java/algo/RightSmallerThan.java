package algo;

import java.util.*;

public class RightSmallerThan {

    public static List<Integer> rightSmallerThan(List<Integer> array) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i<array.size();i++){
            int count = 0;
            for(int j = i+1; j< array.size();j++){
                if(array.get(j) < array.get(i)) count++;
            }
            l.add(count);
        }
        return l;
    }

    public static void main(String args[]){
        List<Integer> array = new ArrayList<>();
        array.add(8); array.add(5); array.add(11); array.add(-1);
        array.add(3); array.add(4); array.add(2);
        array = rightSmallerThan(array);
        array.stream().forEach(System.out::println);

    }

}
