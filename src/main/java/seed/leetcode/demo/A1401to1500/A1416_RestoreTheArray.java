package seed.leetcode.demo.A1401to1500;

public class A1416_RestoreTheArray {
	// TODO: TLE
	long res = 0L;

	public int numberOfArrays(String s, int k) {
		res = 0L;

		backTracking(s.substring(0, 1), s.substring(1), k);

		// Since the answer can be a large number, return this modulo 10^9 + 7
		return (int) (res % 1000000007L);
	}

	private void backTracking(String curr, String remain, int k) {
		if (curr.startsWith("0") || !isValid(curr, k))
			return;

		if (remain.length() == 0) {
			res++;
			return;
		}

		// continue picking
		backTracking(curr + remain.substring(0, 1), remain.substring(1), k);

		// pick next
		backTracking(remain.substring(0, 1), remain.substring(1), k);
	}

	private boolean isValid(String s, int k) {
		return s.length() <= String.valueOf(k).length() && Long.valueOf(s) >= 1L && Long.valueOf(s) <= k;
	}
}
