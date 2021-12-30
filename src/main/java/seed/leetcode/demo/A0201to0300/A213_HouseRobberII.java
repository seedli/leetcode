package seed.leetcode.demo.A0201to0300;

import java.util.Arrays;

public class A213_HouseRobberII {

	public int rob(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);
		if (nums.length == 3)
			return Math.max(Math.max(nums[0], nums[1]), nums[2]);

		// {1,2,3,4}

		// {1,2,3}
		int[] arrRobFirstHouse = Arrays.copyOfRange(nums, 0, nums.length - 1);
		// {2,3,4}
		int[] arrRobSecondHouse = Arrays.copyOfRange(nums, 1, nums.length);

		return Math.max(justRob(arrRobFirstHouse), justRob(arrRobSecondHouse));
	}

	/**
	 * @see seed.leetcode.demo.A0101to0200.A198_HouseRobber
	 */
	public int justRob(int[] nums) {
		int[] dp = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || i == 1) {
				dp[i] = nums[i];
			} else if (i == 2) {
				dp[i] = nums[0] + nums[2];
			} else {
				dp[i] = Math.max(nums[i] + dp[i - 2], nums[i] + dp[i - 3]);
			}
		}

		return Math.max(dp[dp.length - 1], dp[dp.length - 2]);
	}
}
