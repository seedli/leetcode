package seed.leetcode.demo.A001to100;

import java.util.Arrays;

/**
 * Created by User on 2017/2/13.
 */
public class A63_UniquePathsII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1) return 0;

        int X = obstacleGrid[0].length;
        int Y = obstacleGrid.length;
        boolean XisBlocked = false;
        boolean YisBlocked =false;

        int[][] grid = new int[Y][X];
        for(int i = 0; i<Y; i++){
            for(int j = 0; j<X; j++){
                if(i==0 || j==0) {
                    if(obstacleGrid[i][j] == 1){
                        if(i==0){
                            XisBlocked = true;
                            grid[i][j] = 0;
                        }
                        if(j==0){
                            YisBlocked = true;
                            grid[i][j] = 0;
                        }
                    }else{
                        if(i==0 && XisBlocked){
                            grid[i][j] = 0;
                        }else if(j==0 && YisBlocked){
                            grid[i][j] = 0;
                        }else{
                            grid[i][j] = 1;
                        }
                    }
                }else {
                    if(obstacleGrid[i][j] == 1){
                        grid[i][j] = 0;
                    }else{
                        grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
                    }
                }
            }
        }
        for(int[] gr : grid){
            System.out.println(Arrays.toString(gr));
        }
        return grid[Y-1][X-1];
    }

}
