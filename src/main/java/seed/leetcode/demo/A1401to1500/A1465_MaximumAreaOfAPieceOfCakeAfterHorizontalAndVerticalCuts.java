package seed.leetcode.demo.A1401to1500;

import java.util.Arrays;

public class A1465_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {

	public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

		Arrays.sort(horizontalCuts);
		Arrays.sort(verticalCuts);

		// Since the answer can be a large number, return this modulo 10^9 + 7
		return (int) ((long) findLongestSide(h, horizontalCuts) * findLongestSide(w, verticalCuts) % 1000000007);
	}

	private int findLongestSide(int L, int[] cuts) {
		int max = Integer.MIN_VALUE;

		if (cuts.length == 1)
			return Math.max(cuts[0], L - cuts[0]);

		for (int i = 0; i <= cuts.length; i++) {
			int p1, p2;
			if (i == 0) {
				p1 = 0;
				p2 = cuts[i];
			} else if (i == cuts.length) {
				p1 = cuts[i - 1];
				p2 = L;
			} else {
				p1 = cuts[i - 1];
				p2 = cuts[i];
			}
			max = Math.max(max, p2 - p1);
		}

		return max;
	}
}
