package algo;

public class NthFib {

    public static void main(String args[]){
        for(int i = 1;i<10;i++){
            System.out.println(i + "   " + nthfib(i));
        }
    }

    private static int nthfib(int n){
        int i = 0;
        int j = 1;
        if(n == 1) return i;
        if(n == 2) return j;
        int c = 2;
        while(c < n){
            int x = i;
            i = j;
            j = x + j;
            c++;
        }
        return j;
    }
}
