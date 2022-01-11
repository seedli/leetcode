package seed.leetcode.demo.A0801to0900;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class A896_MonotonicArrayTest {

	@Test
	public void test() {
		A896_MonotonicArray a = new A896_MonotonicArray();
		assertTrue(a.isMonotonic(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		assertTrue(a.isMonotonic(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 }));
		assertTrue(a.isMonotonic(new int[] { 9, 6, 2 }));
		assertTrue(a.isMonotonic(new int[] { 2, 6, 9 }));
		assertTrue(a.isMonotonic(new int[] { 1, 1, 2 }));
		assertTrue(a.isMonotonic(new int[] { -1000, 1, 1 }));

		assertFalse(a.isMonotonic(new int[] { 9, 8, 7, 6, -32767, 4, 3, 2, 1 }));
		assertFalse(a.isMonotonic(new int[] { 1, 3, 2, 4 }));
	}
}
