package algo;

public class InsertionSort {

    private static void print(int a[]){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] a = {12,14,13,11,16,10,18,17};
        for(int i = 1;i<a.length;i++){
            print(a);
            if(a[i] >= a[i-1]) continue;
            else{
                for(int j = i;j>0;j--){
                    if(a[j] < a[j-1]){
                        int t = a[j];
                        a[j] = a[j-1];
                        a[j-1] = t;
                    }
                }
            }
        }

    }
}
