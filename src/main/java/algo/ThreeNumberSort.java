package algo;

public class ThreeNumberSort {

    public int[] threeNumberSort(int[] array, int[] order) {
        int st = 0;int j = 0;
        for(int i = 0;i<order.length;i++){
            for(j = st;j<array.length;j++){
                if(array[j] != order[i]){
                    int k = j + 1;
                    for(k = j+1;k<array.length;k++){
                        if(array[k] == order[i]) break;
                    }
                    if(k >= array.length) break;
                    int t = array[j];
                    array[j] = array[k];
                    array[k] = t;

                }
            }
            st = j;
        }
        return array;
    }

    public  static  void  main(String args[]){
        int array[] = {1,0,0,-1,-1,0,1,1};
        int order[] = { 0,1,-1};
        new ThreeNumberSort().threeNumberSort(array,order);
        for(int i : array) System.out.print(i + " ");
    }
}
