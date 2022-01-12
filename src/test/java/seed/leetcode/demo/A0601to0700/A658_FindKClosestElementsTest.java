package seed.leetcode.demo.A0601to0700;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class A658_FindKClosestElementsTest {

	@Test
	public void test() {
		A658_FindKClosestElements a = new A658_FindKClosestElements();

		List<Integer> res = null;

		res = a.findClosestElements(new int[] { 1, 2, 3, 4, 5, 6 }, 4, 5);
		System.out.println(Arrays.toString(res.toArray()));

	}
}
