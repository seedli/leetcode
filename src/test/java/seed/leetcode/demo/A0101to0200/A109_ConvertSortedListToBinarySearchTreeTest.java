package seed.leetcode.demo.A0101to0200;

import java.util.Arrays;

import org.junit.Test;

import seed.leetcode.demo.TreeNode;
import seed.leetcode.demo.Utility;
import seed.leetcode.demo.A0101to0200.A109_ConvertSortedListToBinarySearchTree;

public class A109_ConvertSortedListToBinarySearchTreeTest {

	@Test
	public void test() {
		A109_ConvertSortedListToBinarySearchTree a = new A109_ConvertSortedListToBinarySearchTree();
		TreeNode n = a.sortedListToBST(Utility.ListToListNode(Arrays.asList(new Integer[] { -10, -3, 0, 5, 9 })));

		System.out.println(n.val);
	}
}
