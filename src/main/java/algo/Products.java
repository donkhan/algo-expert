package algo;

import java.util.*;

class Products {

    public  static  void  main(String args[]){
        int a[] = new Products().arrayOfProducts(new int[]{5,1,4,2});
        for(int i = 0;i<a.length;i++)
            System.out.print(a[i] + " ");
    }
    public int[] arrayOfProducts(int[] a) {
        // Write your code here.
        int b[] = new int[a.length];
        for(int i = 0;i<a.length;i++){
            int p = 1;
            for(int j = 0;j<a.length;j++){
                if(i != j) p = p * a[j];
            }
            b[i] = p;
        }
        return b;
    }
}
