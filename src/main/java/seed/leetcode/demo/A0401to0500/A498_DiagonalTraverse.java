package seed.leetcode.demo.A0401to0500;

import java.util.ArrayList;
import java.util.List;

public class A498_DiagonalTraverse {

	private static final String DIR_UP_RIGHT = "UR";
	private static final String DIR_LOW_LEFT = "LL";

	public int[] findDiagonalOrder(int[][] mat) {
		if (mat.length == 1)
			return mat[0];
		else
			return traverse(mat, 0, 0, new ArrayList<Integer>(), DIR_UP_RIGHT);
	}

	private int[] traverse(int[][] mat, int m, int n, List<Integer> trav, String dir) {
		trav.add(mat[m][n]);

		if (m == mat.length - 1 && n == mat[0].length - 1)
			return trav.stream().mapToInt(Integer::intValue).toArray();

		if (dir == DIR_UP_RIGHT) {

			if (m == 0 && n == mat[0].length - 1)
				return traverse(mat, m + 1, n, trav, DIR_LOW_LEFT);
			else if (m == 0)
				return traverse(mat, m, n + 1, trav, DIR_LOW_LEFT);
			else if (n == mat[0].length - 1)
				return traverse(mat, m + 1, n, trav, DIR_LOW_LEFT);
			else
				return traverse(mat, m - 1, n + 1, trav, DIR_UP_RIGHT);

		} else if (dir == DIR_LOW_LEFT) {

			if (n == 0 && m == mat.length - 1)
				return traverse(mat, m, n + 1, trav, DIR_UP_RIGHT);
			else if (n == 0)
				return traverse(mat, m + 1, n, trav, DIR_UP_RIGHT);
			else if (m == mat.length - 1)
				return traverse(mat, m, n + 1, trav, DIR_UP_RIGHT);
			else
				return traverse(mat, m + 1, n - 1, trav, DIR_LOW_LEFT);

		}
		return null;
	}
}
