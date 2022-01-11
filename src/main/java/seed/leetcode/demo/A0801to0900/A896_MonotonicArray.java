package seed.leetcode.demo.A0801to0900;

public class A896_MonotonicArray {

	public boolean isMonotonic(int[] nums) {
		if (nums.length < 3)
			return true;

		if (nums[0] < nums[nums.length - 1])
			return doIncreasing(nums);
		else
			return doDecreasing(nums);
	}

	private boolean doIncreasing(int[] nums) {
		int i = 1;
		int j = nums.length - 2;

		while (i <= j) {

			if (nums[i] < nums[i - 1])
				return false;

			if (nums[j] > nums[j + 1])
				return false;

			if (nums[i] > nums[j])
				return false;

			if (i == j && (nums[i] < nums[i - 1] || nums[i] > nums[j + 1]))
				return false;

			i++;
			j--;
		}

		return true;
	}

	private boolean doDecreasing(int[] nums) {
		int i = 1;
		int j = nums.length - 2;

		while (i <= j) {

			if (nums[i] > nums[i - 1])
				return false;

			if (nums[j] < nums[j + 1])
				return false;

			if (nums[i] < nums[j])
				return false;

			if (i == j && (nums[i] > nums[i - 1] || nums[i] < nums[j + 1]))
				return false;

			i++;
			j--;
		}

		return true;
	}
}
