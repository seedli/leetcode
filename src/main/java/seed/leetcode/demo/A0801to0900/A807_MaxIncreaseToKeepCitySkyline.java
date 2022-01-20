package seed.leetcode.demo.A0801to0900;

public class A807_MaxIncreaseToKeepCitySkyline {

	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int sum = 0;

		int[] maxHeightM = new int[grid.length];
		int[] maxHeightN = new int[grid.length];

		for (int m = 0; m < grid.length; m++) {
			for (int n = 0; n < grid.length; n++) {
				maxHeightM[m] = Math.max(maxHeightM[m], grid[m][n]);
				maxHeightN[m] = Math.max(maxHeightN[m], grid[n][m]);
			}
		}

		for (int m = 0; m < grid.length; m++) {
			for (int n = 0; n < grid[0].length; n++) {
				sum += Math.min(maxHeightM[m], maxHeightN[n]) - grid[m][n];
			}
		}

		return sum;
	}

}
