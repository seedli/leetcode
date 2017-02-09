package seed.leetcode.demo;

/**
 * Created by User on 2017/2/9.
 */
public class A31_NextPermutation {

    //Reference http://www.csie.ntnu.edu.tw/~u91029/Permutation.html#2
    public int[] nextPermutation(int[] nums) {
        boolean isPermuted = false;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i-1] < nums[i]){
                int j = nums.length - 1;
                while(nums[i-1] >= nums[j]) j--;
                swap(nums, i-1, j);
                reverse(nums, i, nums.length-1);
                isPermuted = true;
                break;
            }
        }
        //沒有找到就是已經到底了，下一個就是重新開始
        if(!isPermuted) reverse(nums, 0, nums.length-1);

        return nums;
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
