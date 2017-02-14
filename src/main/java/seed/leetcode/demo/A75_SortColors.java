package seed.leetcode.demo;

import java.util.Arrays;

/**
 * Created by seedli on 2017/2/14.
 */
public class A75_SortColors {
    public void sortColors(int[] nums) {
        if(nums.length <= 1) return;
        int idx=0, idxTmp=1;

        for(int color=0; color<=2; color++){
            while(idxTmp < nums.length){
                if(nums[idx]==color){
                    ++idx;
                }else if(nums[idx] != color && nums[idxTmp] == color){
                    int tmp=nums[idx];
                    nums[idx] = nums[idxTmp];
                    nums[idxTmp] = tmp;
                    ++idx;
                }
                ++idxTmp;
            }
            idxTmp = idx+1;
        }
        System.out.println(Arrays.toString(nums));
    }
}
