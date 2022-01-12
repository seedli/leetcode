package seed.leetcode.demo.A1501to1600;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1588_SumOfAllOddLengthSubarraysTest {

	@Test
	public void test() {
		A1588_SumOfAllOddLengthSubarrays a = new A1588_SumOfAllOddLengthSubarrays();

		assertEquals(58, a.sumOddLengthSubarrays(new int[] { 1, 4, 2, 5, 3 }));
		assertEquals(3, a.sumOddLengthSubarrays(new int[] { 1, 2 }));
		assertEquals(66, a.sumOddLengthSubarrays(new int[] { 10, 11, 12 }));
	}
}
