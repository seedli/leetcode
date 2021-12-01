package seed.leetcode.demo.A001to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 2017/2/18.
 */
public class A90_SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0) return result;
        Arrays.sort(nums);

        boolean[] picked = new boolean[nums.length];
        backtrack(nums,0, result, new ArrayList<>(), picked);
        return result;
    }

    public void backtrack(int[] nums, int depth, List<List<Integer>> result, List<Integer> solution, boolean[] picked){
        if(depth >= nums.length){
            result.add(new ArrayList<>(solution));
            return;
        }

        //pick i
        if(!picked[depth]){ //è·Ÿå?é¢??è?‡ç?„è©±?ª??“å?é¢??‰è¢«??‘é?Žç??
            if(depth == 0 ||
                    depth > 0 && nums[depth-1] == nums[depth] && picked[depth-1] ||
                    depth > 0 && nums[depth-1] != nums[depth]){
                picked[depth] = true;
                solution.add(nums[depth]);
                backtrack(nums, depth+1, result, solution, picked);

                solution.remove(solution.size()-1);
                picked[depth] = false;
            }
        }
        //don't pick i
        backtrack(nums, depth+1, result, solution, picked);
    }

}
