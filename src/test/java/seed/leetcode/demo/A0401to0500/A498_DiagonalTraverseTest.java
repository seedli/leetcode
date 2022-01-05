package seed.leetcode.demo.A0401to0500;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A498_DiagonalTraverseTest {

	@Test
	public void test() {
		A498_DiagonalTraverse a = new A498_DiagonalTraverse();

		verify(new int[] { 1, 2, 4, 7, 5, 3, 6, 8, 9 },
				a.findDiagonalOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));

		verify(new int[] { 1, 2, 3, 4 }, a.findDiagonalOrder(new int[][] { { 1, 2 }, { 3, 4 } }));
	}

	private void verify(int[] a, int[] b) {
		assertEquals(a.length, b.length);

		for (int i = 0; i < a.length; i++) {
			assertEquals(a[i], b[i]);
		}

	}
}
