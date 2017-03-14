package seed.leetcode.demo.A1to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by seedli on 2017/2/12.
 */
public class A59_SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if(n == 0) return result;
        int iterator = 0;

        boolean[][] used= new boolean[n][n];
        for(boolean[] use : used){
            Arrays.fill(use, false);
        }

        boolean goEnd = false;
        int idxX = 0; int idxY = 0;
        int width = n; int height = n;

        //(0,0) 出發
        result[idxY][idxX] = ++iterator;
        used[idxY][idxX] = true;

        while( ! goEnd){
            goEnd = true;

            //go right
            while(idxX < width){
                idxX++;
                if( idxX < width && ! used[idxY][idxX] ){
                    goEnd = false;
                    result[idxY][idxX] = ++iterator;
                    used[idxY][idxX] = true;
                }else{
                    idxX--;
                    break;
                }
            }
            //go down
            while(idxY < height){
                idxY++;
                if( idxY < height && ! used[idxY][idxX]){
                    goEnd = false;
                    result[idxY][idxX] = ++iterator;
                    used[idxY][idxX] = true;
                }else{
                    idxY--;
                    break;
                }
            }
            //go left
            while(idxX >= 0){
                idxX--;
                if(idxX >= 0 && ! used[idxY][idxX]){
                    goEnd = false;
                    result[idxY][idxX] = ++iterator;
                    used[idxY][idxX] = true;
                }else{
                    idxX++;
                    break;
                }
            }
            //go up
            while(idxY >= 0){
                idxY--;
                if( idxY >= 0 && ! used[idxY][idxX]){
                    goEnd = false;
                    result[idxY][idxX] = ++iterator;
                    used[idxY][idxX] = true;
                }else{
                    idxY++;
                    break;
                }
            }

        }

        return result;
    }

}
