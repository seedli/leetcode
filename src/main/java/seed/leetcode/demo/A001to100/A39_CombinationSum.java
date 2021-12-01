package seed.leetcode.demo.A001to100;

import java.util.*;

/**
 * Created by User on 2017/2/8.
 */
public class A39_CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> solution = new ArrayList<>();

        backtrack(result, candidates, target, solution, 0, 0);

        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, int target, List<Integer> solution, int sum, int idx){

        if(sum == target){
            List<Integer> tmpLs = new ArrayList<>();
            tmpLs.addAll(solution);
            result.add(tmpLs);
            return;
        }else if(sum > target){
            return;
        }

        if(idx == nums.length) return;;


        List<Integer> nSolution1 = new ArrayList<>();
        List<Integer> nSolution2 = new ArrayList<>();
        nSolution1.addAll(solution);
        nSolution2.addAll(solution);

        //choose this
        nSolution1.add(nums[idx]);
        backtrack(result, nums, target, nSolution1, sum+nums[idx], idx);


        //not to choose this go to next
        backtrack(result, nums, target, nSolution2, sum, idx+1);

    }

//    private void backtrack(List<List<Integer>> result, int[] nums, int target, LinkedList<Integer> solution, int idx){
//        if(target == 0 && solution.size() > 0){
//            List<Integer> tmpLs = new ArrayList<>();
//            tmpLs.addAll(solution);
//            result.add(tmpLs);
//            if(solution.size() > 0 )solution.pop();
//            return;
//        }
//        if(target < 0){
//            if(solution.size() > 0 )solution.pop();
//            return;
//        }
//
//        for(int i=0; i<nums.length; i++){
//            if(solution.size() > 0 && nums[i] < solution.get(0)){
//                continue;
//            }
//            solution.push(nums[i]);
//            backtrack(result, nums, target-nums[i], solution, idx);
//        }
//
//        if(solution.size() > 0 )solution.pop();
//
//    }

}
