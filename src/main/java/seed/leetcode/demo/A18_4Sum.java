package seed.leetcode.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by seedli on 2017/2/7.
 */
public class A18_4Sum {

    public List<List<Integer>>fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            threeSum(nums, nums[i], result, i+1, target-nums[i]);
        }

        return result;
    }

    public void threeSum(int[] nums, int num4, List<List<Integer>> result, int idx, int target){
        if(idx+1 >= nums.length-1) return;

        for(int i=idx; i<nums.length; i++){
            if(i>idx && nums[i] == nums[i-1]) continue; // avoid duplicate
            twoSum(nums, num4, nums[i], result, i+1, target-nums[i]);
        }
    }

    public void twoSum(int[] nums, int num4, int num3, List<List<Integer>> result, int idx, int target) {
        if(idx >= nums.length-1) return;

        int i = idx, j = nums.length-1, sum, x;
        while (i < j) {
            sum = nums[i] + nums[j];
            if (sum == target) {
                result.add(Arrays.asList(num4, num3, nums[i], nums[j]));

                x = nums[i];
                while (++i < j && x == nums[i]) // avoid duplicate
                    ;
                x = nums[j];
                while (i < --j && x == nums[j]) // avoid duplicate
                    ;
            }
            if (sum < target)
                i++;
            if (sum > target)
                j--;
        }
    }

    //Time Limit Exceed
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        HashSet<List<Integer>> result = new HashSet<List<Integer>>();
//        int[] solution = new int[4];
//        Arrays.sort(nums);
//
//        backtrack(result, 0, 0, nums, solution, target);
//
//        return new ArrayList<List<Integer>>(result);
//    }
//
//    private void backtrack(HashSet<List<Integer>> result, int depth, int idx, int[] nums, int[] solution, int target){
//
//        if(depth >= 4){
//            if(checkSum(solution, target)){
//                List<Integer> list = new ArrayList<>();
//                for(int val : solution){
//                    list.add(val);
//                }
//                result.add(list);
//            }
//            return;
//        }
//
//        if(idx >= nums.length) return;
//
//        //pick nums[i]
//        solution[depth] = nums[idx];
//        backtrack(result, depth+1, idx+1, nums, solution, target);
//
//        //not pick nums[i]
//        backtrack(result, depth, idx+1, nums, solution, target);
//
//    }
//
//    private boolean checkSum(int[] solution, int target){
//        int sum = 0;
//        for(int val: solution){
//            sum += val;
//        }
//        return sum == target;
//    }
}
