package seed.leetcode.demo;

import java.util.*;

/**
 * Created by User on 2017/2/8.
 */
public class A39_CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] used = new boolean[candidates.length];
        Arrays.fill(used, false);
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> solution = new LinkedList<>();

        backtrack(result, candidates, target, solution, 0);

        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, int target, LinkedList<Integer> solution, int idx){
        if(target == 0 && solution.size() > 0){
            List<Integer> tmpLs = new ArrayList<>();
            tmpLs.addAll(solution);
            result.add(tmpLs);
            if(solution.size() > 0 )solution.pop();
            return;
        }
        if(target < 0){
            if(solution.size() > 0 )solution.pop();
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(solution.size() > 0 && nums[i] < solution.get(0)){
                continue;
            }
            solution.push(nums[i]);
            backtrack(result, nums, target-nums[i], solution, idx);
        }

        if(solution.size() > 0 )solution.pop();

    }

}
