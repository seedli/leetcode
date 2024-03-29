package seed.leetcode.demo.A0001to0100;

import java.util.Arrays;

/**
 * Created by User on 2017/2/13.
 */
public class A064_MinimumPathSum {

    //Dynamic Programing, 上面??�左??�哪�??��?��?��?�就??�那�???, XY??�就?��?��??��?�面???
    public int minPathSum(int[][] grid) {
        int X = grid[0].length;
        int Y = grid.length;
        if(X==1 && Y==1) return grid[0][0];

        int[][] MinSumGrid = new int[Y][X];
        MinSumGrid[0][0] = grid[0][0];

        for(int i=0; i<Y; i++){
            for(int j=0; j<X; j++){
                if(i==0 && j>0){
                    MinSumGrid[i][j] = MinSumGrid[i][j-1] + grid[i][j];
                }else if(j==0 && i>0){
                    MinSumGrid[i][j] = MinSumGrid[i-1][j] + grid[i][j];
                }else if(i>0 && j>0){
                    if(MinSumGrid[i-1][j] <= MinSumGrid[i][j-1]){
                        MinSumGrid[i][j] = MinSumGrid[i-1][j]+ grid[i][j];
                    }else{
                        MinSumGrid[i][j] = MinSumGrid[i][j-1] + grid[i][j];
                    }
                }
            }
        }
//        for(int[] gr : MinSumGrid){
//            System.out.println(Arrays.toString(gr));
//        }
        return MinSumGrid[Y-1][X-1];
    }

    //?��backtrack?��??�TLE?���?
    private int MinSum = Integer.MAX_VALUE;

    public int minPathSum1(int[][] grid) {
        int X = grid[0].length;
        int Y = grid.length;
        if(X==1 && Y==1) return grid[0][0];

        backtrack(0,0,X,Y,grid[0][0], grid);

        return MinSum;
    }

    public void backtrack(int idxX, int idxY, int X, int Y, int currentSum, int[][] grid){
        if(idxX == X-1 && idxY == Y-1){
            if(currentSum < MinSum) MinSum = currentSum;
            return;
        }
        //go right
        if(idxX < X-1){
            backtrack(idxX+1, idxY, X, Y, currentSum+grid[idxY][idxX+1], grid);
        }
        //go down
        if(idxY < Y-1){
            backtrack(idxX, idxY+1, X, Y, currentSum+grid[idxY+1][idxX], grid);
        }

    }

}
