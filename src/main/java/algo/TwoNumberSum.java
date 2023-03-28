package algo;

public class TwoNumberSum {

    public static void main(String args[]) {
        solve(new int[]{ 3,5,-4,8,11,1,-1,6});
    }

    private static int[] solve(int a[]){
        int targetSum = 10;
        int[] output = new int[2];
        boolean found = false;
        for(int i = 0;i<a.length-1;i++){
            for(int j = i + 1;j<a.length;j++){
                if(a[i] + a[j] == targetSum ){
                    output[0] = a[i];
                    output[1] = a[j];
                    found = true;
                    System.out.println(a[i] + "  "  + a[j]);
                }
            }
        }
        if(found)
            return output;
        return new int[]{};
    }
}
