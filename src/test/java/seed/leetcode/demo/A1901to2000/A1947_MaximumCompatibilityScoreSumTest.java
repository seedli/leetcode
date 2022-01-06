package seed.leetcode.demo.A1901to2000;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1947_MaximumCompatibilityScoreSumTest {

	@Test
	public void test() {
		A1947_MaximumCompatibilityScoreSum a = new A1947_MaximumCompatibilityScoreSum();

		assertEquals(8, a.maxCompatibilitySum(new int[][] { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 1 } },
				new int[][] { { 1, 0, 0 }, { 0, 0, 1 }, { 1, 1, 0 } }));

		assertEquals(10,
				a.maxCompatibilitySum(new int[][] { { 0, 1, 0, 1, 1, 1 }, { 1, 0, 0, 1, 0, 1 }, { 1, 0, 1, 1, 0, 0 } },
						new int[][] { { 1, 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 1, 1 }, { 0, 1, 0, 0, 1, 1 } }));
	}
}
