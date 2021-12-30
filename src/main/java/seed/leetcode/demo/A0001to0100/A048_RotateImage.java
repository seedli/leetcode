package seed.leetcode.demo.A0001to0100;

import java.util.Arrays;

/**
 * Created by User on 2017/2/9.
 */
public class A048_RotateImage {

    public void rotate(int[][] matrix) {
        int D = matrix.length;

        for(int i=0; i<D/2; i++){
            for(int j=i; j<D-i-1; j++){
                int tmp= matrix[i][j];  //tmp=2
                int R = D-1;
                matrix[i][j] = matrix[R-j][i]; //2=16
                matrix[R-j][i] = matrix[R-i][R-j]; //16=24
                matrix[R-i][R-j] = matrix[j][R-i]; //24=10
                matrix[j][R-i] = tmp; //10=2
            }
        }
        for(int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }
    }

    public void rotate2(int[][] matrix) {
        int[][] ArrRotated = new int[matrix[0].length][matrix.length];

        for(int x=0; x<matrix[0].length; x++){
            int[] tmpArr = new int[matrix.length];
            int idx = 0;
            for(int y=matrix.length-1; y>=0; y--){
                tmpArr[idx++] = matrix[y][x];
            }
            ArrRotated[x] = tmpArr;
        }
        matrix = Arrays.copyOf(ArrRotated, ArrRotated.length);

        for(int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }
    }
}
