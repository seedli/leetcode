package seed.leetcode.demo.A0101to0200;

import org.junit.Test;

import seed.leetcode.demo.TreeNode;
import seed.leetcode.demo.A0101to0200.A105_ConstructBinaryTreeFromPreorderAndInorderTraversal;

public class A105_ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

	@Test
	public void test() {
		A105_ConstructBinaryTreeFromPreorderAndInorderTraversal a = new A105_ConstructBinaryTreeFromPreorderAndInorderTraversal();

		TreeNode n = a.buildTree(new int[] { 0, 1, 3, 6, 7, 4, 2, 5, 8, 9 },
				new int[] { 6, 3, 7, 1, 4, 0, 2, 8, 5, 9 });

		System.out.println(n.val);
	}
}
