package algo;
import java.util.*;

public class KthSmallestInteger {


        public static int quickselect(int[] array, int k) {
            if(array.length < k) return -1;
            Arrays.sort(array);
            return array[k-1];
        }


        public static  void main(String args[]){
            System.out.println(quickselect(new int[]{8,5,2,9,7,6,3},3));
        }

}
