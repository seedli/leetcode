package seed.leetcode.demo.A2001to2100;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class A2089_FindTargetIndicesAfterSortingArray {
	public List<Integer> targetIndices(int[] nums, int target) {
		LinkedList<Integer> res = new LinkedList<>();

		Arrays.sort(nums);
		int idx = Arrays.binarySearch(nums, target);

		if (idx >= 0) {
			res.add(idx);
			int offset = 1;

			boolean reachEndOfLeft = false;
			boolean reachEndOfRight = false;
			while (idx - offset >= 0 || idx + offset < nums.length) {
				if (idx - offset >= 0 && nums[idx - offset] == target)
					res.addFirst(idx - offset);
				else
					reachEndOfLeft = true;

				if (idx + offset < nums.length && nums[idx + offset] == target)
					res.addLast(idx + offset);
				else
					reachEndOfRight = true;

				if (reachEndOfLeft && reachEndOfRight)
					break;

				offset++;
			}
		}

		return res;
	}
}
