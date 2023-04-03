package algo;
import java.util.*;

public class SpiralTraversal {
    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        traverse(array,0,array[0].length,array.length,array[array.length-1].length,list);
        return list;
    }

    private static void traverse(int[][] array, int e1, int e2, int e3, int e4, List<Integer> list) {
        //System.out.println(e1 + " " + e2  + " " + e3 + " " + e4);
        //if(e1 > e2 || e3 > e4) return;
        int n = array.length * array[0].length;
        if( list.size() >= n) return;
        for(int i = e1;i<e2;i++){
            list.add(array[e1][i]);
        }
        if( list.size() >= n) return;
        for(int i = e1+1; i<e3; i++){
            list.add(array[i][e2-1]);
        }
        if( list.size() >= n) return;
        for(int i = e2-2; i >=e1; i--){
            list.add(array[e3-1][i]);
        }
        if( list.size() >= n) return;
        for(int i = e3-2; i>e1; i--){
            list.add(array[i][e1]);
        }
        if( list.size() >= n) return;
        traverse(array,e1+1,e2-1,e3-1,e4-1,list);

    }

    public static void main(String args[]) {
        t2();
    }
    private static void t1(){
        int array[][] = {
                {1,2,3,4},
                {12,13,14,5},
                {11,16,15,6,},
                {10,9,8,7}
        };
        spiralTraverse(array).stream().forEach(System.out::println);
    }

    private static void t2(){
        int array[][] = {
                {1}
        };
        spiralTraverse(array).stream().forEach(System.out::println);
    }

    private static void t3(){
        int array[][] = {
                {19, 32, 33, 34, 25, 8},
                {16, 15, 14, 13, 12, 11},
                {18, 31, 36, 35, 26, 9},
                {1,   2,  3,  4,  5, 6},
                {20, 21, 22, 23, 24, 7},
                {17, 30, 29, 28, 27, 10}
        };
        spiralTraverse(array).stream().forEach(System.out::println);
    }

    private static void t6(){
        int array[][] = {
                {4, 2, 3, 6, 7, 8, 1, 9, 5, 10},
                {12, 19, 15, 16, 20, 18, 13, 17, 11, 14}
        };
        spiralTraverse(array).stream().forEach(System.out::println);
    }
}
