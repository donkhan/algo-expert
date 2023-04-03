package algo;

public class MaximumSumSubMatrix {

    public int maximumSumSubmatrix(int[][] matrix, int size) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int sum = Integer.MIN_VALUE;

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                int x = getSum(matrix,i,j,size);
                if(x > sum) sum = x;
            }
        }
       // System.out.println(sum);
        return sum;
    }

    private int getSum(int[][] matrix, int i, int j, int size) {
        int r = i;
        int rc = 0;
        int sum = 0;
        while(rc < size){
            int c = j;
            int cc = 0;
            if(r >= matrix.length) return Integer.MIN_VALUE;
            while(cc < size){
                if(c >= matrix[r].length) return Integer.MIN_VALUE;
                sum = sum + matrix[r][c];
                c++;
                cc++;
            }
            r++;
            rc++;
        }
        return  sum;
    }

    public  static  void main(String args[]) {
        int m[][] = {
                {2, 4},
                {5, 6},
                {-3, 2}
        };
        new MaximumSumSubMatrix().maximumSumSubmatrix(m,2);
    }
}
