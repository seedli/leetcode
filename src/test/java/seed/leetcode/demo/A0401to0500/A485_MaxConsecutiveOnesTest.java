package seed.leetcode.demo.A0401to0500;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A485_MaxConsecutiveOnesTest {

	@Test
	public void test() {
		A485_MaxConsecutiveOnes a = new A485_MaxConsecutiveOnes();

		assertEquals(3, a.findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
		assertEquals(2, a.findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 }));
	}
}
