package algo;

import java.util.Arrays;

public class SubArraySort {

    private static boolean isSorted(int[] array){
        for(int i = 0;i<array.length-1;i++){
            if(array[i] > array[i+1]) return false;
        }
        return true;
    }

    public static int[] subarraySort(int[] array) {
        // Write your code here.
        int a[] = new int[2];
        a[0] = -1; a[1] = -1;
        if(isSorted(array)) return a;
        int minLength = Integer.MAX_VALUE;
        for(int i = 0;i<array.length-1;i++){
            for(int j = i+1;j<array.length;j++){
                if(j - i > minLength){
                    continue;
                }
                int b[] = new int[array.length];

                for(int k = 0;k<i;k++){
                    b[k] = array[k];
                }
                int c[] = new int[j-i+1];
                for(int k = i,l=0;k<=j;k++,l++){
                    c[l] = array[k];
                }
                for(int k = j+1;k<array.length;k++){
                    b[k] = array[k];
                }
                Arrays.sort(c);
                for(int k = i,l=0;k<=j;k++,l++){
                    b[k] = c[l];
                }
                if(isSorted(b)){
                    //System.out.println(i + "  " + j);
                    a[0] = i;
                    a[1] = j;
                    minLength = j - i;
                }

            }
        }
        return a;
    }

    public static  void main(String args[]){
        int a[] = subarraySort(new int[]{1,2,4,7,10,11,7,12,6,7,16,18,19});
        System.out.println(a[0] + "  " + a[1]);
    }
}
