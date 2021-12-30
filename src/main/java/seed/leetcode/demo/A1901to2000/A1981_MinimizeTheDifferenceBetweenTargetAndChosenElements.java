package seed.leetcode.demo.A1901to2000;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class A1981_MinimizeTheDifferenceBetweenTargetAndChosenElements {

	public int minimizeTheDifference(int[][] mat, int target) {

		Set<Integer> dp = new HashSet<>();

		for (int x = 0; x < mat.length; x++) {
			Set<Integer> tmp = null;
			if (x > 0)
				tmp = new HashSet<Integer>();

			for (int y = 0; y < mat[x].length; y++) {
				if (x == 0) {
					dp.add(target - mat[x][y]);
				} else {
					for (int prev : dp) {
						tmp.add(prev - mat[x][y]);
					}
				}
			}
			if (tmp != null) {
				int max_over = tmp.stream().filter(v -> v < 0).mapToInt(v -> v).max().orElse(Integer.MIN_VALUE);
				dp = tmp.stream().filter(v -> v >= max_over).collect(Collectors.toSet());
			}
		}

		return dp.stream().map(Math::abs).mapToInt(v -> v).min().orElseThrow();
	}

}
