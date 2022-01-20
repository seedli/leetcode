package seed.leetcode.demo.A1201to1300;

public class A1262_GreatestSumDivisibleByThree {

	private int sum = 0;

	public int maxSumDivThree(int[] nums) {
		sum = 0;
		boolean[] visited = new boolean[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 3 == 0) {
				sum += nums[i];
				visited[i] = true;
			}
		}

		backTrack(nums, visited, 0, sum);

		return sum;
	}

	private void backTrack(int[] nums, boolean[] visited, int idx, int sum) {
		if (sum % 3 == 0 && sum > this.sum)
			this.sum = Math.max(this.sum, sum);

		if (idx >= nums.length)
			return;

		// pick
		if (!visited[idx]) {
			backTrack(nums, visited, idx + 1, sum + nums[idx]);
		}
		// not to pick
		backTrack(nums, visited, idx + 1, sum);
	}

}
