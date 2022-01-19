package seed.leetcode.demo.A0101to0200;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A287_FindTheDuplicateNumberTest {

	@Test
	public void test() {
		A287_FindTheDuplicateNumber a = new A287_FindTheDuplicateNumber();

		assertEquals(2, a.findDuplicate(new int[] { 1, 3, 4, 2, 2 }));
		assertEquals(3, a.findDuplicate(new int[] { 3, 1, 3, 4, 2 }));
	}

}
