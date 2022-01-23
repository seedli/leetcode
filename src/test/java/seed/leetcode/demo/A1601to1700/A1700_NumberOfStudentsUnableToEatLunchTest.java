package seed.leetcode.demo.A1601to1700;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1700_NumberOfStudentsUnableToEatLunchTest {
	@Test
	public void test() {
		A1700_NumberOfStudentsUnableToEatLunch a = new A1700_NumberOfStudentsUnableToEatLunch();

		assertEquals(0, a.countStudents(new int[] { 1, 1, 0, 0 }, new int[] { 0, 1, 0, 1 }));
		assertEquals(3, a.countStudents(new int[] { 1, 1, 1, 0, 0, 1 }, new int[] { 1, 0, 0, 0, 1, 1 }));
	}
}
