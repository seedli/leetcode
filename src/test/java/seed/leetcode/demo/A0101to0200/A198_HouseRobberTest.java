package seed.leetcode.demo.A0101to0200;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A198_HouseRobberTest {

	@Test
	public void test() {
		A198_HouseRobber a = new A198_HouseRobber();

		assertEquals(12, a.rob(new int[] { 2, 7, 9, 3, 1 }));
		assertEquals(200, a.rob(new int[] { 2, 200 }));
		assertEquals(602, a.rob(new int[] { 1, 2, 3, 400, 5, 6, 200 }));

		assertEquals(7102,
				a.rob(new int[] { 226, 174, 214, 16, 218, 48, 153, 131, 128, 17, 157, 142, 88, 43, 37, 157, 43, 221,
						191, 68, 206, 23, 225, 82, 54, 118, 111, 46, 80, 49, 245, 63, 25, 194, 72, 80, 143, 55, 209, 18,
						55, 122, 65, 66, 177, 101, 63, 201, 172, 130, 103, 225, 142, 46, 86, 185, 62, 138, 212, 192,
						125, 77, 223, 188, 99, 228, 90, 25, 193, 211, 84, 239, 119, 234, 85, 83, 123, 120, 131, 203,
						219, 10, 82, 35, 120, 180, 249, 106, 37, 169, 225, 54, 103, 55, 166, 124 }));
	}

}
