package seed.leetcode.demo.A001to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 2017/2/6.
 */
public class A034_SearchForARange {
    public static void main(String[] args){
        System.out.println(Arrays.toString(searchRange(new int[]{1,1,1,2,2,2,2,2,3,3,3,3,3}, 2)));
        //System.out.println(Arrays.toString(searchRange(new int[]{2,2}, 2)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int[] result = new int[]{-1,-1};

        int idx = -1;

        //find first target value of array
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) idx = mid;
        }

        if(idx == -1 || nums[idx] != target) return result;

        result[0] = idx;


        start = idx;
        end = nums.length-1;

        //find the last value of the array
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) idx = mid;
        }

        result[1] = idx;


        return result;
    }

}
