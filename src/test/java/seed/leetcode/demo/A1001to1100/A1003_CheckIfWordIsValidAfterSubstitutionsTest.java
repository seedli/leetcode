package seed.leetcode.demo.A1001to1100;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class A1003_CheckIfWordIsValidAfterSubstitutionsTest {

	@Test
	public void test() {
		A1003_CheckIfWordIsValidAfterSubstitutions a = new A1003_CheckIfWordIsValidAfterSubstitutions();
		assertTrue(a.isValid("aabcbabcabcc"));
		assertFalse(a.isValid("aabcbabcabc"));
	}
}
