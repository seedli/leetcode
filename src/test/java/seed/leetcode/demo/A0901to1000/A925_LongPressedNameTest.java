package seed.leetcode.demo.A0901to1000;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class A925_LongPressedNameTest {

	@Test
	public void test() {
		A925_LongPressedName a = new A925_LongPressedName();
		assertTrue(a.isLongPressedName("alex", "aaleex"));
		assertFalse(a.isLongPressedName("saeed", "ssaaedd"));
		assertFalse(a.isLongPressedName("alex", "aaleexa"));
		assertFalse(a.isLongPressedName("alexd", "ale"));
	}
}
