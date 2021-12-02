package seed.leetcode.demo.A001to100;

/**
 * Created by seedli on 2017/2/16.
 */
public class A081_SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        if(nums.length == 1) return nums[0] == target;

        if(nums[0] >= target){ //å¾žå°¾??‹å?‹æ‰¾
            int idx = nums.length-1;
            while(idx >=0){
                if(nums[idx] == target) return true;
                --idx;
            }
        }else{ //å¾žé ­??‹å?‹æ‰¾
            int idx = 0;
            while(idx < nums.length){
                if(nums[idx] == target) return true;
                ++idx;
            }
        }
        return false;
    }

}
