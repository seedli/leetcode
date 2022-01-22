package seed.leetcode.demo.A0901to1000;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import seed.leetcode.demo.A0801to0900.A957_PrisonCellsAfterNDays;

public class A957_PrisonCellsAfterNDaysTest {

	@Test
	public void test() {
		A957_PrisonCellsAfterNDays a = new A957_PrisonCellsAfterNDays();

		assertTrue(Arrays.equals(new int[] { 0, 0, 1, 1, 0, 0, 0, 0 },
				a.prisonAfterNDays(new int[] { 0, 1, 0, 1, 1, 0, 0, 1 }, 7)));

		assertTrue(Arrays.equals(new int[] { 0, 0, 1, 1, 1, 1, 1, 0 },
				a.prisonAfterNDays(new int[] { 1, 0, 0, 1, 0, 0, 1, 0 }, 1000000000)));

		assertTrue(Arrays.equals(new int[] { 0, 0, 1, 0, 1, 1, 0, 0 },
				a.prisonAfterNDays(new int[] { 1, 0, 0, 1, 1, 0, 1, 0 }, 55)));

		assertTrue(Arrays.equals(new int[] { 0, 0, 0, 1, 1, 0, 0, 0 },
				a.prisonAfterNDays(new int[] { 0, 0, 1, 1, 1, 1, 0, 0 }, 8)));

	}
}
