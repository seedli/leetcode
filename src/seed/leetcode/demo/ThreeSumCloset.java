package seed.leetcode.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by seedli on 2017/1/25.
 */
public class ThreeSumCloset {

    public static void main(String[] args){
        System.out.println(
                threeSumClosest( new int[]{ -3,-2,-5,3,-4} ,
                -1)
        );
    }

    public static int threeSumClosest(int[] nums, int target) {
        //Arrays.sort(nums);
        int ClosetValue= Integer.MAX_VALUE - 1000;
        boolean hasSetedValue = false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];

                    if(sum - target == 0) return sum;

                    if( Math.abs(sum - target) < Math.abs(ClosetValue - target) ){
                        ClosetValue = sum;
                        hasSetedValue = true;
                    }
                }
            }
        }
        if(!hasSetedValue) ClosetValue = target;
        return ClosetValue;
    }
}
