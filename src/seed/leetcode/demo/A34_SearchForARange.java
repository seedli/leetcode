package seed.leetcode.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 2017/2/6.
 */
public class A34_SearchForARange {
    public static void main(String[] args){
        System.out.println(Arrays.toString(searchRange(new int[]{2,2}, 2)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int[] result = new int[]{-1,-1};

        //binary search first target
        int firstIdx = Arrays.binarySearch(nums, target);
        if(firstIdx < 0) return result;

        start = firstIdx;
        //find the upper range of the target value
        while(start != end){
            int mid = (start + end) / 2;
            if(nums[mid] > target){
                end = mid-1;
            }else if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        result[1] = end;

        start = 0;
        end = firstIdx;
        //find the lower range of the target value
        while(start != end){
            int mid = (start + end) / 2;
            if(nums[mid] > target){
                end = mid-1;
            }else if(nums[mid] < target){
                start = mid+1;
            }else{
                start = mid+1;
            }
        }
        result[0] = end;

        return result;
    }

}
