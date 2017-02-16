package seed.leetcode.demo;

import java.util.Arrays;

/**
 * Created by User on 2017/2/16.
 */
public class A33_SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0] == target ? 0 : -1;

        if(nums[0] >= target){ //從尾開始找
            int idx = nums.length-1;
            while(idx >=0){
                if(nums[idx] == target) return idx;
                --idx;
            }
        }else{ //從頭開始找
            int idx = 0;
            while(idx < nums.length){
                if(nums[idx] == target) return idx;
                ++idx;
            }
        }
        return -1;
    }

}
