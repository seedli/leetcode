package seed.leetcode.demo.A0101to0200;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A151_ReverseWordsInAStringTest {

	@Test
	public void test() {
		A151_ReverseWordsInAString a = new A151_ReverseWordsInAString();

		assertEquals("world hello", a.reverseWords("  hello world  "));
		assertEquals("example good a", a.reverseWords("a good   example"));
	}
}
