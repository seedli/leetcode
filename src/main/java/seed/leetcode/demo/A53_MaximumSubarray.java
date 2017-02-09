package seed.leetcode.demo;

/**
 * Created by seedli on 2017/2/9.
 */
public class A53_MaximumSubarray {

    public static int maxSubArray(int[] A) {
        int maxSoFar=A[0], maxEndingHere=A[0];
        for (int i=1;i<A.length;++i){
            maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    //Time Limit Exceeded
    public int maxSubArray_Bad(int[] nums) {
        int max=Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int left = i;
            int right = i;
            while(right <= nums.length-1){
                int sum = Sum(nums, left, right);
                if(sum > max){
                    max = sum;
                }
                right++;
            }
        }
        return max;
    }

    private int Sum(int[] nums, int left, int right){
        int sum=0;
        while(left <= right){
            sum += nums[left++];
        }
        return sum;
    }

}
