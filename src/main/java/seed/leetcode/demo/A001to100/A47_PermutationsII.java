package seed.leetcode.demo.A001to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by User on 2017/2/9.
 */
public class A47_PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(IntStream.of(nums).boxed().collect(Collectors.toList()));

        while(nextPermutation(nums)){
            result.add(IntStream.of(nums).boxed().collect(Collectors.toList()));
        }

        return result;
    }

    private boolean nextPermutation(int[] nums) {
        for(int i=nums.length-1; i>0; i--){
            if(nums[i-1] < nums[i]){
                int j = nums.length - 1;
                while(nums[i-1] >= nums[j]) j--;
                swap(nums, i-1, j);
                reverse(nums, i, nums.length-1);
                return true;
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums, i++, j--);
        }
    }
}
