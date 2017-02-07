package seed.leetcode.demo;

import java.util.Arrays;

/**
 * Created by seedli on 2017/2/6.
 */
public class A35_SearchInsertPosition {

    public static void main(String[] args){
        System.out.println(searchInsert(new int[]{1,3}, 2));
    }

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        //find nearest value
        while(start <= end){
            int mid = (start + end) / 2;

            if(target == nums[mid]) {
                return mid;
            }else if(nums[mid] < target){
                if(mid == nums.length -1){
                    return nums.length;
                }else if(nums[mid+1] > target){
                    return mid+1;
                }
            }else if(nums[mid] > target){
                if(mid == 0 || nums[mid-1] < target){
                    return mid;
                }
            }

            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }
        }

        return -1;
    }
}
