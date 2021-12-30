package seed.leetcode.demo.A0001to0100;

import java.util.Arrays;

/**
 * Created by seedli on 2017/2/6.
 */
public class A035_SearchInsertPosition {

    public static void main(String[] args){
        System.out.println(searchInsert2(new int[]{1,3,5,6}, 7));
        //System.out.println(searchInsert(new int[]{1,3,5,6,7,9,10,12,19}, 8));
    }


    public static int searchInsert2(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                return mid;
            }else if(mid == 0 && nums[mid] > target){
                return 0;
            }else if(mid == nums.length-1 && nums[mid] < target){
                return nums.length;
            }else if(nums[mid] > target && nums[mid-1] < target){
                return mid;
            }


            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }
        }

        return -1;
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
