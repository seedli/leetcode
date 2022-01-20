package seed.leetcode.demo.A0801to0900;

public class A807_MaxIncreaseToKeepCitySkyline {

	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int sum = 0;

		int[] maxHeightM = new int[grid.length];
		int[] maxHeightN = new int[grid.length];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				maxHeightM[i] = Math.max(maxHeightM[i], grid[i][j]);
				maxHeightN[i] = Math.max(maxHeightN[i], grid[j][i]);
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
