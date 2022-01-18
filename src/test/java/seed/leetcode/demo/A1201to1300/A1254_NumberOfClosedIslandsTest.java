package seed.leetcode.demo.A1201to1300;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1254_NumberOfClosedIslandsTest {

	@Test
	public void test() {
		A1254_NumberOfClosedIslands a = new A1254_NumberOfClosedIslands();

		assertEquals(2, a.closedIsland(new int[][] { { 1, 1, 1, 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0, 1, 1, 0 },
				{ 1, 0, 1, 0, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 0 } }));

		assertEquals(1, a.closedIsland(new int[][] { { 0, 0, 1, 0, 0 }, { 0, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 } }));

		assertEquals(2,
				a.closedIsland(new int[][] { { 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 },
						{ 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1 },
						{ 1, 1, 1, 1, 1, 1, 1 } }));
	}
}
