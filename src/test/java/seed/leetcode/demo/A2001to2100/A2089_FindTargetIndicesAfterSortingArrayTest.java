package seed.leetcode.demo.A2001to2100;

import static org.junit.Assert.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

public class A2089_FindTargetIndicesAfterSortingArrayTest {

	@Test
	public void test() {
		A2089_FindTargetIndicesAfterSortingArray a = new A2089_FindTargetIndicesAfterSortingArray();

		assertEquals(IntStream.of(1, 2).boxed().collect(Collectors.toList()),
				a.targetIndices(new int[] { 1, 2, 5, 2, 3 }, 2));

		assertEquals(IntStream.of(1, 2, 3, 4, 5, 6).boxed().collect(Collectors.toList()),
				a.targetIndices(new int[] { 1, 2, 5, 2, 3, 2, 2, 2, 2 }, 2));

	}
}
