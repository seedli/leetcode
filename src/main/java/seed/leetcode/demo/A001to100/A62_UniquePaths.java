package seed.leetcode.demo.A001to100;

/**
 * Created by seedli on 2017/2/12.
 */
public class A62_UniquePaths {

    //?ˆ¥äººç?„ç?”æ??
    //Dynamic Programmingæ¦‚å¿µ
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i==0||j==0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j-1] + grid[i-1][j];
            }
        }
        return grid[m-1][n-1];
    }

    //TLE
    private int paths = 0;

    public int uniquePaths2(int X, int Y) {

        backtrack(1,1, X, Y);

        return paths;
    }

    public void backtrack(int idxX, int idxY, int X, int Y){
        if(idxX == X && idxY == Y){
            ++paths;
            return;
        }
        //go right
        if(idxX < X){
            backtrack(idxX+1, idxY, X, Y);
        }
        //go down
        if(idxY < Y){
            backtrack( idxX, idxY+1, X, Y);
        }

    }
}
