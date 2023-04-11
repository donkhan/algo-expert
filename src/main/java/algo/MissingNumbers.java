package algo;

import java.util.Arrays;

public class MissingNumbers {

    public int[] missingNumbers(int[] a) {
        int r[] = new int[2];
        if(a.length == 0) {
            r[0] = 1; r[1] = 2;
            return r;
        }
        int n = a.length + 2;
        Arrays.sort(a);
        int j = 1; int k = 0;
        for(int i = 0;i<a.length;){
            if(a[i] != j){
                r[k++] = j;
                j++;
                continue;
            }
            i++;
            j++;
        }
        if(r[0] == 0){
            r[0] = j; r[1] = j+1;
        }
        if(r[1] == 0) r[1] = j;
        return r;
    }

    public static void main(String args[]){
        int a[] = new MissingNumbers().missingNumbers(new int[]{1,4,3});
        a = new MissingNumbers().missingNumbers(new int[]{});
        for(int i : a){
            System.out.print(i+ " ");
        }
    }
}
