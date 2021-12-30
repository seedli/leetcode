package seed.leetcode.demo.A0201to0300;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A213_HouseRobberIITest {

	@Test
	public void test() {
		A213_HouseRobberII a = new A213_HouseRobberII();

		int res = 0;

		res = a.rob(new int[] { 1, 2, 3, 1 });
		assertEquals(4, res);

	}
}
