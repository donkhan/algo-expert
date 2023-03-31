package experiment;

public class NthFib {

    private int fib(int n){
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fib(n-2) + fib(n-1);
    }
    public static void main(String args[]){
        int n = new NthFib().fib(6);
        System.out.println(n);
    }
}
