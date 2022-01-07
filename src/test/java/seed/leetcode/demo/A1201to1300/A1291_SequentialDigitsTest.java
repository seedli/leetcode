package seed.leetcode.demo.A1201to1300;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class A1291_SequentialDigitsTest {

	@Test
	public void test() {
		A1291_SequentialDigits a = new A1291_SequentialDigits();

		assertEquals(Arrays.asList(123, 234), a.sequentialDigits(100, 300));

		assertEquals(Arrays.asList(1234, 2345, 3456, 4567, 5678, 6789, 12345), a.sequentialDigits(1000, 13000));

		assertEquals(Arrays.asList(67, 78, 89, 123), a.sequentialDigits(58, 155));

		assertEquals(Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567, 678, 789, 1234, 2345, 3456,
				4567, 5678, 6789, 12345, 23456, 34567, 45678, 56789, 123456, 234567, 345678, 456789, 1234567, 2345678,
				3456789, 12345678, 23456789, 123456789), a.sequentialDigits(10, 1000000000));

		assertEquals(Arrays.asList(789, 1234), a.sequentialDigits(744, 1928));

		assertEquals(Arrays.asList(12345, 23456), a.sequentialDigits(8511, 23553));

		assertEquals(Arrays.asList(123456789), a.sequentialDigits(28932835, 733240848));

	}
}
