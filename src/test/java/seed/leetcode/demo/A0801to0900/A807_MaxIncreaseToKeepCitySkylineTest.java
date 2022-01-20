package seed.leetcode.demo.A0801to0900;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A807_MaxIncreaseToKeepCitySkylineTest {

	@Test
	public void test() {
		A807_MaxIncreaseToKeepCitySkyline a = new A807_MaxIncreaseToKeepCitySkyline();

		assertEquals(35, a.maxIncreaseKeepingSkyline(
				new int[][] { { 3, 0, 8, 4 }, { 2, 4, 5, 7 }, { 9, 2, 6, 3 }, { 0, 3, 1, 0 } }));
	}
}
