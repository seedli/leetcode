package seed.leetcode.demo;

import java.util.Arrays;

/**
 * Created by User on 2017/2/17.
 */
public class A85_MaximalRectangle {

    //Not Finished
    public int maximalRectangle(char[][] matrix) {

        int[][] height = new int[matrix.length][matrix[0].length];
        int[][] width = new int[matrix.length][matrix[0].length];
        int maxArea = 0;

        for(int Y=0; Y<matrix.length; Y++){
            for(int X=0; X<matrix[0].length; X++){
                if(matrix[Y][X] != '0'){
                    //Generate Width Array
                    if(X==0 && matrix[Y][X] == '1'){
                        width[Y][X] = 1;
                    }else if(matrix[Y][X] == '1'){
                        if(matrix[Y][X-1] == '1'){
                            width[Y][X] = width[Y][X-1] + 1;
                        }else{
                            width[Y][X] = 1;
                        }
                    }
                    //Generate Height Array
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
        for(int[] row: width){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("-----------");
        for(int[] row: height){
            System.out.println(Arrays.toString(row));
        }

        return maxArea;

    }


}
