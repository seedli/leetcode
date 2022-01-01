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

		// e.g. all houses {1,2,3,4}

		// start from robbing 1st house e.g. {1,2,3}
		int[] arrRobFirstHouse = Arrays.copyOfRange(nums, 0, nums.length - 1);
		// start from robbing 2nd house e.g. {2,3,4}
		int[] arrRobSecondHouse = Arrays.copyOfRange(nums, 1, nums.length);

		return Math.max(subRub(arrRobFirstHouse), subRub(arrRobSecondHouse));
	}

	/**
	 * @see seed.leetcode.demo.A0101to0200.A198_HouseRobber
	 */
	public int subRub(int[] nums) {
		int curr, prev1, prev2, prev3;
		curr = prev1 = prev2 = prev3 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || i == 1) {
				curr = nums[i];
			} else if (i == 2) {
				curr = nums[0] + nums[2];
			} else {
				curr = Math.max(nums[i] + prev2, nums[i] + prev3);
			}
			prev3 = prev2;
			prev2 = prev1;
			prev1 = curr;
		}

		return Math.max(prev1, prev2);
	}
}
