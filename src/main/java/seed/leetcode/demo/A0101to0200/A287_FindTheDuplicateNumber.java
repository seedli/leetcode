package seed.leetcode.demo.A0101to0200;

public class A287_FindTheDuplicateNumber {

	public int findDuplicate(int[] nums) {
		boolean[] visited = new boolean[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (visited[nums[i]])
				return nums[i];
			else
				visited[nums[i]] = true;
		}

		return -1;
	}
}
