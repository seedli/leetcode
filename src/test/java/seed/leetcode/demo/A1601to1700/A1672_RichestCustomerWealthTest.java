package seed.leetcode.demo.A1601to1700;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1672_RichestCustomerWealthTest {

	@Test
	public void test() {
		A1672_RichestCustomerWealth a = new A1672_RichestCustomerWealth();

		assertEquals(6, a.maximumWealth(new int[][] { { 1, 2, 3 }, { 3, 2, 1 } }));

		assertEquals(17, a.maximumWealth(new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }));

	}
}
