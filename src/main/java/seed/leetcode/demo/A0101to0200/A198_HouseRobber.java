package seed.leetcode.demo.A0101to0200;

/**
 * @author seedl https://leetcode.com/problems/house-robber/
 */
public class A198_HouseRobber {

	public int rob(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);

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

	// =============== TLE =============
	int max_total = 0;

	public int rob_TLE(int[] nums) {
		if (nums.length == 1)
			return nums[0];

		max_total = 0;

		choseAndRob(nums, 0, 0);
		choseAndRob(nums, 1, 0);

		return max_total;
	}

	private void choseAndRob(int[] nums, int idx, int total) {
		total += nums[idx];

		if (idx == nums.length - 1 || idx == nums.length - 2) {
			if (total > max_total) {
				max_total = total;
				return;
			}
		}

		if (idx + 2 < nums.length) {
			choseAndRob(nums, idx + 2, total);
		}
		if (idx + 3 < nums.length) {
			choseAndRob(nums, idx + 3, total);
		}

	}
}
