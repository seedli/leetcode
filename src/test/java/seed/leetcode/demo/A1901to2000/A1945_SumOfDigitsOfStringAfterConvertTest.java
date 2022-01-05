package seed.leetcode.demo.A1901to2000;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1945_SumOfDigitsOfStringAfterConvertTest {

	@Test
	public void test() {
		A1945_SumOfDigitsOfStringAfterConvert a = new A1945_SumOfDigitsOfStringAfterConvert();

		assertEquals(8, a.getLucky("zbax", 2));
		assertEquals(36, a.getLucky("iiii", 1));
		assertEquals(6, a.getLucky("leetcode", 2));
	}
}
