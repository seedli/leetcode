package seed.leetcode.demo.A0101to0200;

import org.junit.Test;

import seed.leetcode.demo.TreeNode;
import seed.leetcode.demo.Utility;

public class A145_BinaryTreePostorderTraversalTest {

	@Test
	public void test() {
		A145_BinaryTreePostorderTraversal a = new A145_BinaryTreePostorderTraversal();

		TreeNode root = null;
		root = Utility.arrayToTree(new Integer[] { 1, null, 2, 3 });

		a.postorderTraversal(root);
	}
}
