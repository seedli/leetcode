package seed.leetcode.demo.A001to100;

import java.util.Arrays;

/**
 * Created by User on 2017/2/16.
 */
public class A33_SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0] == target ? 0 : -1;

        if(nums[0] >= target){ //å¾žå°¾??‹å?‹æ‰¾
            int idx = nums.length-1;
            while(idx >=0){
                if(nums[idx] == target) return idx;
                --idx;
            }
        }else{ //å¾žé ­??‹å?‹æ‰¾
            int idx = 0;
            while(idx < nums.length){
                if(nums[idx] == target) return idx;
                ++idx;
            }
        }
        return -1;
    }

}
