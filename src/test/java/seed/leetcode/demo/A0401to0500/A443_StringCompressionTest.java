package seed.leetcode.demo.A0401to0500;

import org.junit.Test;

import seed.leetcode.demo.A0401to0500.A443_StringCompression;

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
