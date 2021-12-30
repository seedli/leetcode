package seed.leetcode.demo.A0401to0500;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import seed.leetcode.demo.A0401to0500.A401_BinaryWatch;

public class A401_BinaryWatchTest {

	@Test
	public void test() {
		A401_BinaryWatch a = new A401_BinaryWatch();

		assertEquals(Arrays.asList(
				new String[] { "0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00" }),
				a.readBinaryWatch(1));

		assertEquals(Arrays.asList(new String[] { "0:00" }), a.readBinaryWatch(0));

		assertEquals(Arrays.asList(new String[] {}), a.readBinaryWatch(9));
	}
}
