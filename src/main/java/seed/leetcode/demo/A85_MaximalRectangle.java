package seed.leetcode.demo;

import java.util.Arrays;

/**
 * Created by User on 2017/2/17.
 */
public class A85_MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int[][] height = new int[matrix.length][matrix[0].length];
        int maxArea = 0;

        for(int Y=0; Y<matrix.length; Y++){
            for(int X=0; X<matrix[0].length; X++){
                if(matrix[Y][X] != '0'){
                    //Generate Height 2D Array
                    if(Y==0 && matrix[Y][X] == '1'){
                        height[Y][X] = 1;
                    }else if(matrix[Y][X] == '1'){
                        if(matrix[Y-1][X] == '1'){
                            height[Y][X] = height[Y-1][X] + 1;
                        }else{
                            height[Y][X] = 1;
                        }
                    }
                }
            }
        }
        for(int Y=0; Y<matrix.length; Y++) {
            for (int X = 0; X < matrix[0].length; X++) {
                maxArea = Math.max(getMaxArea(X,Y,height), maxArea);
            }
        }
        for(int[] row: height){
            System.out.println(Arrays.toString(row));
        }

        return maxArea;
    }

    public int getMaxArea(int X, int Y, int[][] height){
        int max = 0;
        int pointX = X;
        int currentHeight = height[Y][X];

        while(pointX >=0){
            currentHeight = Math.min(height[Y][pointX], currentHeight);
            max = Math.max(max, currentHeight*(X-pointX+1));
            --pointX;
        }
        return max;
    }


}
