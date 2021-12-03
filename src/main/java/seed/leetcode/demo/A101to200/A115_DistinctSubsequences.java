package seed.leetcode.demo.A101to200;

public class A115_DistinctSubsequences {

	// ===== TLE ====
	int result = 0;

	public int numDistinct(String s, String t) {
		result = 0;

		backtracking(s.toCharArray(), t.toCharArray(), 0, 0);

		return result;
	}

	private void backtracking(char[] source, char[] target, int tIdx, int depth) {
		if (tIdx == target.length) {
			result++;
			System.out.println(" got one");
			return;
		}

		// reach the bottom
		if (depth == source.length)
			return;

		if (source[depth] == target[tIdx]) {
			// choose this one and go ahead to find the next
			backtracking(source, target, tIdx + 1, depth + 1);
		}

		// don't choose and go forward
		backtracking(source, target, tIdx, depth + 1);

	}
}
