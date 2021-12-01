package seed.leetcode.demo.A401to500;

import org.junit.Test;

public class A443_StringCompressionTest {

	@Test
	public void test() {
		A443_StringCompression a = new A443_StringCompression();
		char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

		System.out.println(a.compress(chars));

		char[] chars2 = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };

		System.out.println(a.compress(chars2));

		char[] chars3 = { 'a', 'a', 'a', 'b', 'b', 'a', 'a' };

		System.out.println(a.compress(chars3));
	}
}
