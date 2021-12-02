package seed.leetcode.demo.A001to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 2017/2/3.
 */
public class A046_Permutations {

    public static void main(String[] args){
        permute(new int[]{1,2,3});
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        int[] solution = new int[nums.length];
        Arrays.fill(used, false);
        Arrays.fill(solution, 0);

        backtrack(result, nums, solution, used, 0);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, int[] nums, int[] solution, boolean[] used, int depth){
        if(depth == nums.length){
            List<Integer> intList = new ArrayList<>();
            for(int i: solution){
                intList.add(i);
            }
            result.add(intList);
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(!used[i]){
                used[i] = true;

                solution[depth] = nums[i];
                backtrack(result, nums, solution, used, depth+1);

                used[i] = false;
            }
        }
    }
}
