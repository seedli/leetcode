package seed.leetcode.demo.A1501to1600;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1584_MinCostToConnectAllPointsTest {

	@Test
	public void test() {
		A1584_MinCostToConnectAllPoints a = new A1584_MinCostToConnectAllPoints();

		int result = 0;

//		result = a.minCostConnectPoints(new int[][] { { 0, 0 }, { 2, 2 }, { 3, 10 }, { 5, 2 }, { 7, 0 } });
//		assertEquals(20, result);

		result = a.minCostConnectPoints(new int[][] { { 2, -3 }, { -17, -8 }, { 13, 8 }, { -17, -15 } });
		assertEquals(53, result);

	}
}
