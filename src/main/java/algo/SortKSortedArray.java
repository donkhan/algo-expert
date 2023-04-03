package algo;
import java.util.*;

public class SortKSortedArray {

    public int[] sortKSortedArray(int[] a, int k) {
        // Write your code here.
        k = k + 1;
        if(k > a.length) k = a.length;
        for(int i = 0;i<a.length;i++){
            int tmpArray[] = new int[k];
            if(i + k > a.length) continue;
            for(int j = 0;j<k;j++) tmpArray[j] = a[i+j];
            Arrays.sort(tmpArray);
            for(int j = 0;j<k;j++) a[i+j] = tmpArray[j];
        }
        return a;
    }

    public  static void main(String args[]){
        //int[] array = new SortKSortedArray().sortKSortedArray(new int[]{ 3,2,1,5,4,7,6,5},3);
        //int[] array = new SortKSortedArray().sortKSortedArray(new int[]{ 5,4,3,2,-100},5);
        int[] array = new SortKSortedArray().sortKSortedArray(new int[]{1,2,3,4,5,6,1 },8);
        //int[] array = new SortKSortedArray().sortKSortedArray(new int[]{-1,-3,-4,2,1,3 },2);
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
