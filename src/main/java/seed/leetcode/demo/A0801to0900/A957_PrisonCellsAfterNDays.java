package seed.leetcode.demo.A0801to0900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A957_PrisonCellsAfterNDays {

	public int[] prisonAfterNDays(int[] cells, int n) {

		int[] prev;
		boolean patternFound = false;
		List<String> haveSeen = new ArrayList<>();
		haveSeen.add(Arrays.toString(cells));

		for (int i = 1; i <= n; i++) {
			prev = Arrays.copyOf(cells, cells.length);

			for (int j = 1; j <= 6; j++) {
				if (prev[j - 1] == prev[j + 1])
					cells[j] = 1;
				else
					cells[j] = 0;
			}

			if (i == 1 && !patternFound) {
				cells[0] = cells[7] = 0;
			}

			if (haveSeen.contains(Arrays.toString(cells)) && !patternFound) {
				int numOfpattern = haveSeen.size() - haveSeen.indexOf(Arrays.toString(cells));
				n = (n - i) % numOfpattern;
				i = 0;
				patternFound = true;
			} else {
				haveSeen.add(Arrays.toString(cells));
			}
		}

		return cells;
	}
}
