package seed.leetcode.demo.A1401to1500;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1416_RestoreTheArrayTest {

	@Test
	public void test() {
		A1416_RestoreTheArray a = new A1416_RestoreTheArray();

		assertEquals(8, a.numberOfArrays("1317", 2000));
		assertEquals(0, a.numberOfArrays("1000", 10));
		assertEquals(1, a.numberOfArrays("1000", 10000));

		assertEquals(21752500, a.numberOfArrays("2553462832281151811513004352253111", 456));
	}

}
