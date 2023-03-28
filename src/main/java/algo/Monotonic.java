package algo;


public class Monotonic {

    public static void main(String args[]){
        //System.out.println(isMonotonic(new int[]{-1, -1, -2, -3, -4, -5, -5, -5, -6, -7, -8, -8, -9, -10, -11}));
        System.out.println(isMonotonic(new int[]{-1, -1, -1,-1,-1, -1, -1,-1}));
    }

    private static int checkOrder(int a[]){
        int i = 0;
        while(i < a.length-2 && a[i] == a[i+1]){
            i++;
        }
        if(a[i] > a[i+1])return 1;
        return -1;
    }
    public static boolean isMonotonic(int[] a) {
        if(a.length <= 2 )return true;
        int order = checkOrder(a);
        if(order == -1) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) return false;
            }
        }else{
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) return false;
            }
        }
        return true;
    }
}
