package seed.leetcode.demo.A0401to0500;

public class A485_MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int result = 0;
		int sum = 0;

		for (int i : nums) {
			if (i == 0)
				sum = 0;
			else
				sum++;

			result = Math.max(sum, result);
		}

		return result;
	}
}
