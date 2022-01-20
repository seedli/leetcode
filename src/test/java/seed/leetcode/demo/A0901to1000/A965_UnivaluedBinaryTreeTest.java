package seed.leetcode.demo.A0901to1000;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import seed.leetcode.demo.TreeNode;
import seed.leetcode.demo.Utility;

public class A965_UnivaluedBinaryTreeTest {

	@Test
	public void test() {
		A965_UnivaluedBinaryTree a = new A965_UnivaluedBinaryTree();

		TreeNode root = null;

		root = Utility.ListToTreeNode(Arrays.asList(new Integer[] { 1, 1, 1, 1, 1, null, 1 }));
		assertTrue(a.isUnivalTree(root));

		root = Utility.ListToTreeNode(Arrays.asList(new Integer[] { 1, 1, 2, 1, 1, null, 1 }));
		assertFalse(a.isUnivalTree(root));
	}
}
