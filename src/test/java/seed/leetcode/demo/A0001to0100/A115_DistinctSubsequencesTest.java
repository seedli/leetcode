package seed.leetcode.demo.A0001to0100;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import seed.leetcode.demo.A0101to0200.A115_DistinctSubsequences;

public class A115_DistinctSubsequencesTest {

	@Test
	public void test115() {
		A115_DistinctSubsequences a = new A115_DistinctSubsequences();

		assertEquals(3, a.numDistinct("rabbbit", "rabbit"));

		assertEquals(5, a.numDistinct("babgbag", "bag"));

		assertEquals(100, a.numDistinct(
				"adbdadeecadeadeccaeaabdabdbcdabddddabcaaadbabaaedeeddeaeebcdeabcaaaeeaeeabcddcebddebeebedaecccbdcbcedbdaeaedcdebeecdaaedaacadbdccabddaddacdddc",
				"bcddceeeebecbc"));
	}
}
