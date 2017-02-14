package seed.leetcode.demo;

import java.util.Arrays;

/**
 * Created by User on 2017/2/14.
 */
public class A74_Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int start = 0;
        int end = matrix.length-1;

        while(start <= end){
            int mid = (start + end) >>> 1;
            if(matrix[mid][0] <= target && matrix[mid][matrix[0].length-1] >= target){
                return Arrays.binarySearch(matrix[mid], target) >= 0;
            }else if(matrix[mid][0] > target){
                end = mid - 1;
            }else if(matrix[mid][matrix[0].length-1] < target){
                start = mid + 1;
            }
        }
        return false;
    }


}
