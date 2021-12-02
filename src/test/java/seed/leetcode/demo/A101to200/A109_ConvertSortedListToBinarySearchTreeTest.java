package seed.leetcode.demo.A101to200;

import java.util.Arrays;

import org.junit.Test;

import seed.leetcode.demo.TreeNode;
import seed.leetcode.demo.Utility;

public class A109_ConvertSortedListToBinarySearchTreeTest {

	@Test
	public void test() {
		A109_ConvertSortedListToBinarySearchTree a = new A109_ConvertSortedListToBinarySearchTree();
		TreeNode n = a.sortedListToBST(Utility.ListToListNode(Arrays.asList(new Integer[] { -10, -3, 0, 5, 9 })));

		System.out.println(n.val);
	}
}
