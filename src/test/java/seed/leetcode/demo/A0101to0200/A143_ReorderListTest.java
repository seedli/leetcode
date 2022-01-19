package seed.leetcode.demo.A0101to0200;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

import seed.leetcode.demo.Utility;

public class A143_ReorderListTest {

	@Test
	public void test() {
		A143_ReorderList a = new A143_ReorderList();

		a.reorderList(Utility.ListToListNode(IntStream.of(1, 2, 3, 4, 5).boxed().collect(Collectors.toList())));

		a.reorderList(Utility.ListToListNode(IntStream.of(1, 2, 3, 4).boxed().collect(Collectors.toList())));

		a.reorderList(Utility.ListToListNode(IntStream.of(1, 2, 3).boxed().collect(Collectors.toList())));

		a.reorderList(Utility.ListToListNode(IntStream.of(1, 2).boxed().collect(Collectors.toList())));
	}
}
