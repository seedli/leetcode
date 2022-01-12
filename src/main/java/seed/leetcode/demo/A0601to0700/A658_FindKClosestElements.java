package seed.leetcode.demo.A0601to0700;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class A658_FindKClosestElements {

	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		LinkedList<Integer> res = new LinkedList<>();

		if (x <= arr[0])
			return Arrays.stream(arr).boxed().limit(k).collect(Collectors.toList());
		else if (x >= arr[arr.length - 1])
			return Arrays.stream(arr).boxed().skip(k > arr.length ? 0 : arr.length - k).collect(Collectors.toList());

		int idx = findIdx(arr, x);
		res.add(arr[idx]);

		int offsetL = 1;
		int offsetR = 1;

		for (int i = 0; i < k - 1; i++) {
			if (idx - offsetL >= 0 && idx + offsetR < arr.length) {
				if (Math.abs(arr[idx - offsetL] - x) <= Math.abs(arr[idx + offsetR] - x)) {
					res.addFirst(arr[idx - offsetL]);
					offsetL++;
				} else {
					res.addLast(arr[idx + offsetR]);
					offsetR++;
				}
			} else if (idx + offsetR >= arr.length) {
				res.addFirst(arr[idx - offsetL]);
				offsetL++;
			} else if (idx - offsetL < 0) {
				res.addLast(arr[idx + offsetR]);
				offsetR++;
			}
		}

		return res;
	}

	private int findIdx(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return i;

			if (arr[i] > x) {
				if (Math.abs(arr[i - 1] - x) <= Math.abs(arr[i] - x))
					return i - 1;
				else
					return i;
			}
		}
		return -1;
	}
}
