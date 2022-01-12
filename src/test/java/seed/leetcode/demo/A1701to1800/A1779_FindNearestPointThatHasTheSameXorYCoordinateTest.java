package seed.leetcode.demo.A1701to1800;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1779_FindNearestPointThatHasTheSameXorYCoordinateTest {

	@Test
	public void test() {
		A1779_FindNearestPointThatHasTheSameXorYCoordinate a = new A1779_FindNearestPointThatHasTheSameXorYCoordinate();

		assertEquals(2, a.nearestValidPoint(3, 4, new int[][] { { 1, 2 }, { 3, 1 }, { 2, 4 }, { 2, 3 }, { 4, 4 } }));
		assertEquals(0, a.nearestValidPoint(3, 4, new int[][] { { 3, 4 } }));
		assertEquals(-1, a.nearestValidPoint(3, 4, new int[][] { { 2, 3 } }));
	}
}
