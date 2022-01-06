package seed.leetcode.demo.A1901to2000;

/**
 * 
 * https://leetcode.com/problems/maximum-compatibility-score-sum/discuss/1360853/Java-oror-Backtracking-oror-Easy-to-Understand
 */
public class A1947_MaximumCompatibilityScoreSum {

	int max;

	public int maxCompatibilitySum(int[][] students, int[][] mentors) {
		boolean[] visited = new boolean[students.length];
		backtrack(visited, students, mentors, 0, 0);
		return max;
	}

	public void backtrack(boolean[] visitedMentor, int[][] students, int[][] mentors, int pos, int score) {
		if (pos >= students.length) {
			max = Math.max(max, score);
			return;
		}
		for (int i = 0; i < mentors.length; i++) {
			if (!visitedMentor[i]) {
				visitedMentor[i] = true;
				backtrack(visitedMentor, students, mentors, pos + 1, score + score(students[pos], mentors[i]));
				visitedMentor[i] = false;
			}
		}
	}

	public int score(int[] a, int[] b) {
		int count = 0;

		for (int i = 0; i < b.length; i++)
			if (a[i] == b[i])
				count += 1;
		return count;
	}
}
