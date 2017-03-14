package seed.leetcode.demo.A1to100;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by User on 2017/2/15.
 */
public class A78_Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,0, result, new ArrayList<>());
        return result;
    }

    public void backtrack(int[] nums, int depth, List<List<Integer>> result, List<Integer> solution){
        if(depth >= nums.length){
            result.add(new ArrayList<>(solution));
            return;
        }

        //pick i
        solution.add(nums[depth]);
        backtrack(nums, depth+1, result, solution);

        solution.remove(solution.size()-1);
        //don't pick i
        backtrack(nums, depth+1, result, solution);
    }

}
