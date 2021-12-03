package seed.leetcode.demo.A401to500;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class A401_BinaryWatchTest {

	@Test
	public void test() {
		A401_BinaryWatch a = new A401_BinaryWatch();

		assertEquals(Arrays.asList(
				new String[] { "0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00" }),
				a.readBinaryWatch(1));
	}
}
