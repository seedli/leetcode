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

		// dynamically record 4 records
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
