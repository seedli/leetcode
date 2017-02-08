package seed.leetcode.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by User on 2017/2/8.
 */
public class A40_CombinationSum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] used = new boolean[candidates.length];
        Arrays.fill(used, false);
        //List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> result = new HashSet<>();

        backtrack(result, 0, candidates, used, target);

        return new ArrayList<List<Integer>>(result);
    }

    private void backtrack(HashSet<List<Integer>> result, int idx, int[] nums, boolean[] used, int target){
        if(target < 0) return;
        if(target == 0){
            List<Integer> ls = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                if(used[i]){
                    ls.add(nums[i]);
                }
            }
            result.add(ls);
            return;
        }

        if(idx >= nums.length) return;

        used[idx] = true;
        backtrack(result, idx+1, nums, used, target-nums[idx]);

        used[idx] = false;
        backtrack(result, idx+1, nums, used, target);
    }
}
