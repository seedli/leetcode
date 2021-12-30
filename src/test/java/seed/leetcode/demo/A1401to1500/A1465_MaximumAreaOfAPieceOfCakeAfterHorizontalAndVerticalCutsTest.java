package seed.leetcode.demo.A1401to1500;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1465_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCutsTest {

	@Test
	public void test() {
		A1465_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts a = new A1465_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts();

		int res = 0;

		res = a.maxArea(5, 4, new int[] { 1, 2, 4 }, new int[] { 1, 3 });
		assertEquals(4, res);

		res = a.maxArea(5, 4, new int[] { 3, 1 }, new int[] { 1 });
		assertEquals(6, res);

		res = a.maxArea(5, 4, new int[] { 3 }, new int[] { 3 });
		assertEquals(9, res);

		res = a.maxArea(1000000000, 1000000000, new int[] { 2 }, new int[] { 2 });
		assertEquals(81, res);
	}
}
