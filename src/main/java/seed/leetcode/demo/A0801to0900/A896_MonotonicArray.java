package seed.leetcode.demo.A0801to0900;

public class A896_MonotonicArray {

	public boolean isMonotonic(int[] nums) {
		if (nums.length == 1)
			return true;
		else if (nums.length == 2)
			return (nums[0] - nums[1] != 0);

		if (nums[0] < nums[nums.length - 1])
			return doIncreasing(nums);
		else
			return doDecreasing(nums);
	}

	private boolean doIncreasing(int[] nums) {
		int i = 1;
		int j = nums.length - 2;

		int prevI = nums[0];
		int prevJ = nums[nums.length - 1];

		while (i <= j) {

			if (nums[i] < prevI)
				return false;

			if (nums[j] > prevJ)
				return false;

			if (nums[i] > nums[j])
				return false;

			if (i == j && (nums[i] < prevI || nums[i] > prevJ))
				return false;

			prevI = nums[i++];
			prevJ = nums[j--];
		}

		return true;
	}

	private boolean doDecreasing(int[] nums) {
		int i = 1;
		int j = nums.length - 2;

		int prevI = nums[0];
		int prevJ = nums[nums.length - 1];

		while (i <= j) {

			if (nums[i] > prevI)
				return false;

			if (nums[j] < prevJ)
				return false;

			if (nums[i] < nums[j])
				return false;

			if (i == j && (nums[i] > prevI || nums[i] < prevJ))
				return false;

			prevI = nums[i++];
			prevJ = nums[j--];
		}

		return true;
	}
}
