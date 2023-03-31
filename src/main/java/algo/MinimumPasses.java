package algo;

public class MinimumPasses {

    public int minimumPassesOfMatrix(int[][] m) {
        // Write your code here.
        int[][] o = new int[m.length][m[0].length];
        int bnegatives = 0;
        for(int i = 0;i<m.length;i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j] < 0) bnegatives++;
            }
        }
        if(bnegatives == 0) return 0;
        int rows = m.length;
        int cols = m[0].length;
        for(int row = 0;row<rows;row++){
            for(int col = 0;col<cols;col++){
                int v = m[row][col];
                if(v >= 0) {
                    o[row][col] = v;
                    continue;
                }
                if(row > 0){
                    int u = m[row-1][col];
                    if(u > 0){
                        v = v * -1;
                        o[row][col] = v;
                        continue;
                    }
                }
                if(row < rows-1){
                    int d = m[row+1][col];
                    if(d > 0){
                        v = v * -1;
                        o[row][col] = v;
                        continue;
                    }
                }
                if(col > 0){
                    int l = m[row][col-1];
                    if(l > 0){
                        v = v * -1;
                        o[row][col] = v;
                        continue;
                    }
                }
                if(col < cols-1){
                    int r = m[row][col+1];
                    if(r > 0) {
                        v = v * -1;
                        o[row][col] = v;
                        continue;
                    }
                }
                o[row][col] = v;
            }
        }
        int anegatives = 0;
        for(int i = 0;i<m.length;i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(o[i][j] < 0) anegatives++;
            }
        }
        if(anegatives == bnegatives){
            return -1;
        }
        if(anegatives == 0){
            return 1;
        }
        int x = minimumPassesOfMatrix(o);
        if(x == -1) return -1;
        return 1 + x;
    }
    public  static  void main(String args[]){
        int[][] m = {
                {1,0,0,-2,-3},
                {-4,-5,-6,-2,-1},
                {0,0,0,0,-1},
                {-1,0,3,0,3}
        };
        System.out.println(new MinimumPasses().minimumPassesOfMatrix(m));
    }
}
