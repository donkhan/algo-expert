package algo;

import java.util.*;

public class SelectionSort {

    public static void main(String args[]){
        selectionSort(new int[]{1,2,3,8,9,2,1});
    }
    public static int[] selectionSort(int[] a) {
        for(int i = 0;i<a.length-1;i++){
            int min = a[i];
            int pos = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j] < min){
                    min = a[j];
                    pos = j;
                }
            }
            int t = a[i];
            a[i] = min;
            a[pos] = t;
        }
        return a;
    }
}
