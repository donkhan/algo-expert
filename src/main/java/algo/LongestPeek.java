package algo;

public class LongestPeek {

    private static boolean isPeek(int[] a){
        if(a.length <= 2) return false;
        int i = 0;
        int asc = 0;
        while (a[i] < a[i+1] && i < a.length-1){
            asc++;
            i++;
            if(i == a.length-1) break;
        }
        if(i == a.length-1) return false;
        int desc = 0;
        while (a[i] > a[i+1] && i < a.length-1){
            desc++;
            i++;
            if(i == a.length-1) break;
        }
        if(asc == 0 || desc == 0) return false;
        boolean flag = asc + desc == a.length-1;
        return flag;
    }
    public static int longestPeak(int[] array) {
        // Write your code here.
        int longPeek = 0;
        for(int i = 0;i<array.length-1;i++){
            for(int j = i+1; j<array.length;j++){
                int a[] = new int[j-i+1];
                for(int k = i,l=0;k<=j;k++,l++) {
                    a[l] = array[k];
                }
                if(a.length < longPeek) continue;
                if(isPeek(a)){
                    longPeek = a.length;
                }
            }
        }

        return longPeek;
    }

    public  static  void main(String args[]){
        //System.out.println(longestPeak(new int[]{1,2,3,3,4,0,10,6,5,-1,-3,2,3}));
        //System.out.println(longestPeak(new int[]{1,3,2}));
        System.out.println(longestPeak(new int[]{5,4,3,2,1,2,1}));

    }
}
