package seed.leetcode.demo.A1401to1500;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class A1437_CheckIfAll1sAreAtLeastLengthKPlacesAwayTest {

	@Test
	public void test() {
		A1437_CheckIfAll1sAreAtLeastLengthKPlacesAway a = new A1437_CheckIfAll1sAreAtLeastLengthKPlacesAway();

		assertTrue(a.kLengthApart(new int[] { 1, 0, 0, 0, 1, 0, 0, 1 }, 2));
		assertFalse(a.kLengthApart(new int[] { 1, 0, 0, 1, 0, 1 }, 2));
		assertTrue(a.kLengthApart(new int[] { 1, 0, 1, 0, 1 }, 1));
		assertFalse(a.kLengthApart(new int[] { 1, 1, 1 }, 1));
		assertTrue(a.kLengthApart(new int[] { 1, 1, 1 }, 0));
		assertFalse(a.kLengthApart(new int[] { 1, 1, 1, 0 }, 3));
	}
}
