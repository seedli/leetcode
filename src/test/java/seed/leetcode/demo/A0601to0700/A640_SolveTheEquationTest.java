package seed.leetcode.demo.A0601to0700;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A640_SolveTheEquationTest {

	@Test
	public void test() {
		A640_SolveTheEquation a = new A640_SolveTheEquation();

		assertEquals("x=2", a.solveEquation("x+5-3+x=6+x-2"));
		assertEquals("x=-1", a.solveEquation("2x+3x-6x=x+2"));
		assertEquals("No solution", a.solveEquation("x=x+2"));
		assertEquals("Infinite solutions", a.solveEquation("0x=0"));
		assertEquals("x=1", a.solveEquation("-x=-1"));
	}
}
