package seed.leetcode.demo.A001to100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2017/2/2.
 */
public class A026_RemoveDuplicatesFromSortedArray {

    public static void main(String args[]){
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int idx = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[idx]){
                nums[++idx] = nums[i];
            }
        }

        return idx+1;
    }

}
