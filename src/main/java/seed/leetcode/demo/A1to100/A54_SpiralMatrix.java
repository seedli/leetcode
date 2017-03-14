package seed.leetcode.demo.A1to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by seedli on 2017/2/9.
 */
public class A54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0) return result;

        boolean[][] used= new boolean[matrix.length][matrix[0].length];
        for(boolean[] use : used){
            Arrays.fill(use, false);
        }

        boolean goEnd = false;
        int idxX = 0; int idxY = 0;
        int width = matrix[0].length; int height = matrix.length;

        //(0,0) 出發
        result.add(matrix[idxY][idxX]);
        used[idxY][idxX] = true;

        while( ! goEnd){
            goEnd = true;

            //go right
            while(idxX < width){
                idxX++;
                if( idxX < width && ! used[idxY][idxX] ){
                    goEnd = false;
                    result.add(matrix[idxY][idxX]);
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
                    result.add(matrix[idxY][idxX]);
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
                    result.add(matrix[idxY][idxX]);
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
                    result.add(matrix[idxY][idxX]);
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
