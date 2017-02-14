package seed.leetcode.demo;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by User on 2017/2/14.
 */
public class A73_SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        HashSet<Integer> setZeroRow = new HashSet<>();
        HashSet<Integer> setZeroColumn = new HashSet<>();

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    setZeroColumn.add(j);
                    setZeroRow.add(i);
                }
            }
        }

        for(int i=0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(setZeroRow.contains(i)){
                    Arrays.fill(matrix[i],0);
                    break;
                }else if(setZeroColumn.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int[] line : matrix){
            System.out.println(Arrays.toString(line));
        }
    }

}
