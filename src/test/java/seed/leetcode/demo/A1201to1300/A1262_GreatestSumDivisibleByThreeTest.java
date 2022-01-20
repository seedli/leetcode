package seed.leetcode.demo.A1201to1300;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1262_GreatestSumDivisibleByThreeTest {

	@Test
	public void test() {
		A1262_GreatestSumDivisibleByThree a = new A1262_GreatestSumDivisibleByThree();

		assertEquals(18, a.maxSumDivThree(new int[] { 3, 6, 5, 1, 8 }));
	}
}
