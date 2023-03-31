package algo;

public class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Write your code here.

        if(a.length == 1) return a;
        if(a.length == 2){
            if(a[0] > a[1]){
                return new int[]{a[1],a[0]};
            }
            return a;
        }
        int half = a.length/2;
        int u[] = new int[half];
        for(int i = 0;i<half;i++){
            u[i] = a[i];
        }
        int l[] = new int[a.length-half];
        for(int i = half,j = 0;i<a.length;i++,j++){
            l[j] = a[i];
        }
        u = mergeSort(u);
        l = mergeSort(l);
        int b[] = new int[a.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < u.length && j < l.length){
            if(u[i] < l[j]){
                b[k++] = u[i++];
            }else{
                b[k++] = l[j++];
            }
        }
        while(i < u.length)
            b[k++] = u[i++];
        while(j < l.length)
            b[k++] = l[j++];


        return b;
    }

    public static void main(String args[]){
        int x[] = MergeSort.mergeSort(new int[]{1,3,2});
        for(int a : x) {
            System.out.print(a + " ");
        }
    }
}
