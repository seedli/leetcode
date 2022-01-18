package seed.leetcode.demo.A1201to1300;

import java.util.LinkedList;
import java.util.Queue;

public class A1254_NumberOfClosedIslands {

	static class Land {
		public int m;
		public int n;

		public Land(int m, int n) {
			this.m = m;
			this.n = n;
		}
	}

	private int noOfIslands = 0;

	public int closedIsland(int[][] grid) {
		if (grid.length <= 2 || grid[0].length <= 2)
			return 0;

		noOfIslands = 0;

		for (int m = 1; m < grid.length - 1; m++)
			for (int n = 1; n < grid[0].length - 1; n++) {
				if (grid[m][n] == 0)
					checkLand(m, n, grid);
			}

		return noOfIslands;
	}

	private void checkLand(int m, int n, int[][] grid) {
		Queue<Land> queue = new LinkedList<>();
		boolean isIsland = true;

		queue.add(new Land(m, n));

		while (!queue.isEmpty()) {
			Land p = queue.poll();
			grid[p.m][p.n] = 2;

			if (isEdge(p.m, p.n, grid)) {
				isIsland = false;
			}

			// up
			findLand(p.m - 1, p.n, grid, queue);

			// down
			findLand(p.m + 1, p.n, grid, queue);

			// left
			findLand(p.m, p.n - 1, grid, queue);

			// right
			findLand(p.m, p.n + 1, grid, queue);
		}

		if (isIsland)
			noOfIslands++;
	}

	private void findLand(int m, int n, int[][] grid, Queue<Land> queue) {
		if (isValid(m, n, grid) && grid[m][n] == 0)
			queue.add(new Land(m, n));
	}

	private boolean isValid(int m, int n, int[][] grid) {
		return m >= 0 && m < grid.length && n >= 0 && n < grid[0].length;
	}

	private boolean isEdge(int m, int n, int[][] grid) {
		return m == 0 || m == grid.length - 1 || n == 0 || n == grid[0].length - 1;
	}
}
