package algo;

public class QuickSort {

    private void print(int a[],int low,int high){
        for(int i = low;i<=high;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void qsort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            qsort(arr, begin, partitionIndex-1);
            qsort(arr, partitionIndex+1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }



    public static void main(String args[]) {
        t2();
    }

    private static void t2(){
        //int a[] = {8, 5, 2, 9, 5, 6, 3};
        int a[] = { 5,6,5};
        //int a[] = { 2,5 };
        QuickSort qs = new QuickSort();
        qs.qsort(a,0,a.length-1);
        qs.print(a,0, a.length-1);
    }

    private static void t1(){
        int a[] = {4,2,6,5,3,9};
        new QuickSort().qsort(a,0,a.length-1);
    }
}
